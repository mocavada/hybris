/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package my.bookstore.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.bookstore.core.model.BookModel;
import my.bookstore.facades.product.data.BookData;

/**
 * @author D061253
 *
 */
public class BookstoreProductPopulator implements Populator<ProductModel, ProductData> {

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		if (source instanceof BookModel)
		{
			target.setISBN10(((BookModel) source).getISBN10());
			target.setISBN13(((BookModel) source).getISBN13());
			target.setPublisher(((BookModel) source).getPublisher());
			target.setLanguage(((BookModel) source).getLanguage());
			target.setPublishedDate(((BookModel) source).getPublishedDate());
			target.setRentable(source.getRentable());
		//TODO exercise 7.1: Populate the rewardPoints attribute
			target.setRewardPoints(source.getRewardPoints());	
		}

	}

}
