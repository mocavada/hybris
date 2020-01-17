import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.catalog.enums.ClassificationAttributeTypeEnum;
import my.bookstore.core.model.BookModel
import de.hybris.platform.catalog.model.CatalogModel;
import de.hybris.platform.catalog.model.ProductFeatureModel;

def script = new GroovyScriptEngine( '.' ).with {
	loadScriptByName( '../../Logger.groovy' ) //for this to work, Logger.groovy should've already been put inside platform directory
}
this.metaClass.mixin script

//NOTE: If we run scripts from ant there is no user session information
userService.setCurrentUser(userService.getAdminUser())

def checkBook(){
CatalogModel cm=catalogService.getCatalogForId('bookstoreProductCatalog');
if(cm==null)
addError('bookstoreProductCatalog catalog not found!')
else{
    BookModel book=(BookModel)productService.getProductForCode(cm.getActiveCatalogVersion(),'8942944779')
    if(book==null)
   		addError('Book with code:8942944779 is not found!')
    else{
    	addLog('Book with code:8942944779 found!')
        if(book.getISBN10()==null)
			addError('ISBN10 is missing!')
        if(book.getAuthors()==null)
			addError('Author(s) is/are missing!')
        if(book.getISBN13()==null)
			addError('ISBN13 is missing!')
        if(book.getRentable()==null)
			addError('Rentable is missing!')
        if(book.getName(Locale.ENGLISH)==null)
			addError('Name is missing!')
        if(book.getRewardPoints()==null)
			addError('RewardPoints are missing!')
    }
	List<ProductFeatureModel>features=book.getFeatures();
	if(features==null){
		addError('Book with code:8942944779 doesn\'t contain any features!')
	}
	def expectedFeatures = [
		'digitalclassification.drm',
		'digitalclassification.filesize',
		'digitalclassification.deliveryformat',
		'audioclassification.length'
	]
	def featuresList = []
	for (pfm in features){
		featuresList.add(pfm.getQualifier().substring(pfm.getQualifier().lastIndexOf('/')+1))
	}
	for (exFeature in expectedFeatures){
		if (!featuresList.contains(exFeature))
			addError("Feature ${exFeature} is missing from Book with code:8942944779!")
	}
	def setDif = featuresList.minus(expectedFeatures)
	if (setDif.size() > 0){
		for (feature in setDif)
			addError("Feature ${feature} is not supposed to be assigned to Book with code:8942944779!")
	}
}
}

def checkCategories(code, subCatList){
    try{
    	def categoryModels=categoryService.getCategoriesForCode(code);
    	if(categoryModels?.size() > 0){
        	def categoryModel=categoryModels[0] 
        	def userDefinedSubCatModel=[]

            categoryModel.getAllSubcategories().each{catModel ->
                userDefinedSubCatModel.add(catModel.getCode())
            }

       	 	subCatList.each{
            	if(userDefinedSubCatModel.contains(it)){
                	addLog("OK: ${it}")
            	}else{
                	addError("NOT OK: ${it}")
            	}
       	 	}
        }
  
    }catch(UnknownIdentifierException ex){
        addError("Error in verifying ${code}. Make sure this category exists or being created.")
    }
}


def checkClassificationCategories(classCatCode, features){
   
    try{
        def categoryModel=categoryService.getCategoryForCode(classCatCode)
        def classModelSet=defaultClassificationClassesResolverStrategy.resolve(categoryModel)
        def attr=defaultClassificationClassesResolverStrategy.getAllClassAttributeAssignments(classModelSet)
        addLog("Classification Category: $classCatCode.........OK")
        addLog("checking Category features for: $classCatCode")
            
        def createdFeatures=[:]
 
        attr.each{
            createdFeatures.put(it.getClassificationAttribute().getCode(), it.getAttributeType())
        }

        features.keySet.each{ feature ->

            if(createdFeatures.containsKey(feature)){
                if(createdFeatures.get(feature)==features.get(feature)){
                    addLog("Category feature: $feature...........OK")
                }else{
                    addError("Category feature: $feature is wrong type. It should be: ${features.get(feature)}")
                }
            }else {
                addError("Missing Category feature: $feature for category classification: $classCatCode")
            }
           
        }
		
    }catch(UnknownIdentifierException ex){
        addError("Error in verifying $classCatCode. Make sure this classification category exists or being created.")
    }
    
}


def digCatFeatures=
    ["DRM":ClassificationAttributeTypeEnum.STRING,
     "filesize":ClassificationAttributeTypeEnum.NUMBER,
     "deliveryFormat":ClassificationAttributeTypeEnum.ENUM]
checkClassificationCategories('digitalclassification',digCatFeatures)

def dimCatFeatures=["pages":ClassificationAttributeTypeEnum.NUMBER]
checkClassificationCategories('dimensionclassification',dimCatFeatures)

def audioCatFeatures=["length":ClassificationAttributeTypeEnum.STRING]
checkClassificationCategories('audioclassification',audioCatFeatures)

def digitalclassificationCat=["kindle"]
checkCategories('digitalclassification',digitalclassificationCat)

def dimensionclassificationCat=['paperback','hardcover']
checkCategories('dimensionclassification',dimensionclassificationCat)

def audioclassificationCat=['audioCD']
checkCategories('audioclassification',audioclassificationCat)

def fictionSubCat=['drama','crime','fantasy','horror','mystery','romance',
    'sciencefiction','thriller','comedy']
checkCategories('fiction',fictionSubCat)

def nonFictionSubCat=['computerscience','autobiography','dictionary','encyclopedia',
    'history','philosophy','self-help']
checkCategories('non-fiction',nonFictionSubCat)
				 
checkBook()	
			 
printOutputLog()