/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 16, 2020 7:23:14 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Book}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBook extends Product
{
	/** Qualifier of the <code>Book.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>Book.ISBN10</code> attribute **/
	public static final String ISBN10 = "ISBN10";
	/** Qualifier of the <code>Book.ISBN13</code> attribute **/
	public static final String ISBN13 = "ISBN13";
	/** Qualifier of the <code>Book.publisher</code> attribute **/
	public static final String PUBLISHER = "publisher";
	/** Qualifier of the <code>Book.publishedDate</code> attribute **/
	public static final String PUBLISHEDDATE = "publishedDate";
	/** Qualifier of the <code>Book.edition</code> attribute **/
	public static final String EDITION = "edition";
	/** Qualifier of the <code>Book.publication</code> attribute **/
	public static final String PUBLICATION = "publication";
	/** Qualifier of the <code>Book.authors</code> attribute **/
	public static final String AUTHORS = "authors";
	/** Relation ordering override parameter constants for Book2AuthorRelation from ((bookstorecore))*/
	protected static String BOOK2AUTHORRELATION_SRC_ORDERED = "relation.Book2AuthorRelation.source.ordered";
	protected static String BOOK2AUTHORRELATION_TGT_ORDERED = "relation.Book2AuthorRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Book2AuthorRelation from ((bookstorecore))*/
	protected static String BOOK2AUTHORRELATION_MARKMODIFIED = "relation.Book2AuthorRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(ISBN10, AttributeMode.INITIAL);
		tmp.put(ISBN13, AttributeMode.INITIAL);
		tmp.put(PUBLISHER, AttributeMode.INITIAL);
		tmp.put(PUBLISHEDDATE, AttributeMode.INITIAL);
		tmp.put(EDITION, AttributeMode.INITIAL);
		tmp.put(PUBLICATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.authors</code> attribute.
	 * @return the authors
	 */
	public Collection<User> getAuthors(final SessionContext ctx)
	{
		final List<User> items = getLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOK2AUTHORRELATION,
			"User",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.authors</code> attribute.
	 * @return the authors
	 */
	public Collection<User> getAuthors()
	{
		return getAuthors( getSession().getSessionContext() );
	}
	
	public long getAuthorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOK2AUTHORRELATION,
			"User",
			null
		);
	}
	
	public long getAuthorsCount()
	{
		return getAuthorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.authors</code> attribute. 
	 * @param value the authors
	 */
	public void setAuthors(final SessionContext ctx, final Collection<User> value)
	{
		setLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOK2AUTHORRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOK2AUTHORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.authors</code> attribute. 
	 * @param value the authors
	 */
	public void setAuthors(final Collection<User> value)
	{
		setAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors
	 */
	public void addToAuthors(final SessionContext ctx, final User value)
	{
		addLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOK2AUTHORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOK2AUTHORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to authors. 
	 * @param value the item to add to authors
	 */
	public void addToAuthors(final User value)
	{
		addToAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors
	 */
	public void removeFromAuthors(final SessionContext ctx, final User value)
	{
		removeLinkedItems( 
			ctx,
			true,
			BookstoreCoreConstants.Relations.BOOK2AUTHORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BOOK2AUTHORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from authors. 
	 * @param value the item to remove from authors
	 */
	public void removeFromAuthors(final User value)
	{
		removeFromAuthors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.edition</code> attribute.
	 * @return the edition - Book edition
	 */
	public Integer getEdition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.edition</code> attribute.
	 * @return the edition - Book edition
	 */
	public Integer getEdition()
	{
		return getEdition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.edition</code> attribute. 
	 * @return the edition - Book edition
	 */
	public int getEditionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEdition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.edition</code> attribute. 
	 * @return the edition - Book edition
	 */
	public int getEditionAsPrimitive()
	{
		return getEditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.edition</code> attribute. 
	 * @param value the edition - Book edition
	 */
	public void setEdition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.edition</code> attribute. 
	 * @param value the edition - Book edition
	 */
	public void setEdition(final Integer value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.edition</code> attribute. 
	 * @param value the edition - Book edition
	 */
	public void setEdition(final SessionContext ctx, final int value)
	{
		setEdition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.edition</code> attribute. 
	 * @param value the edition - Book edition
	 */
	public void setEdition(final int value)
	{
		setEdition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.ISBN10</code> attribute.
	 * @return the ISBN10 - International Standard Book Number with 10 digits
	 */
	public String getISBN10(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISBN10);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.ISBN10</code> attribute.
	 * @return the ISBN10 - International Standard Book Number with 10 digits
	 */
	public String getISBN10()
	{
		return getISBN10( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.ISBN10</code> attribute. 
	 * @param value the ISBN10 - International Standard Book Number with 10 digits
	 */
	public void setISBN10(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISBN10,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.ISBN10</code> attribute. 
	 * @param value the ISBN10 - International Standard Book Number with 10 digits
	 */
	public void setISBN10(final String value)
	{
		setISBN10( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.ISBN13</code> attribute.
	 * @return the ISBN13 - International Standard Book Number with 13 digits
	 */
	public String getISBN13(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISBN13);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.ISBN13</code> attribute.
	 * @return the ISBN13 - International Standard Book Number with 13 digits
	 */
	public String getISBN13()
	{
		return getISBN13( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.ISBN13</code> attribute. 
	 * @param value the ISBN13 - International Standard Book Number with 13 digits
	 */
	public void setISBN13(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISBN13,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.ISBN13</code> attribute. 
	 * @param value the ISBN13 - International Standard Book Number with 13 digits
	 */
	public void setISBN13(final String value)
	{
		setISBN13( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("User");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(BOOK2AUTHORRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.language</code> attribute.
	 * @return the language - Language
	 */
	public String getLanguage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.language</code> attribute.
	 * @return the language - Language
	 */
	public String getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.language</code> attribute. 
	 * @param value the language - Language
	 */
	public void setLanguage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.language</code> attribute. 
	 * @param value the language - Language
	 */
	public void setLanguage(final String value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publication</code> attribute.
	 * @return the publication - Book publication
	 */
	public String getPublication(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publication</code> attribute.
	 * @return the publication - Book publication
	 */
	public String getPublication()
	{
		return getPublication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publication</code> attribute. 
	 * @param value the publication - Book publication
	 */
	public void setPublication(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publication</code> attribute. 
	 * @param value the publication - Book publication
	 */
	public void setPublication(final String value)
	{
		setPublication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publishedDate</code> attribute.
	 * @return the publishedDate - Publisher of the book/magazine/newspaper
	 */
	public Date getPublishedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PUBLISHEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publishedDate</code> attribute.
	 * @return the publishedDate - Publisher of the book/magazine/newspaper
	 */
	public Date getPublishedDate()
	{
		return getPublishedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publishedDate</code> attribute. 
	 * @param value the publishedDate - Publisher of the book/magazine/newspaper
	 */
	public void setPublishedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PUBLISHEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publishedDate</code> attribute. 
	 * @param value the publishedDate - Publisher of the book/magazine/newspaper
	 */
	public void setPublishedDate(final Date value)
	{
		setPublishedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher - Publisher of the book/magazine/newspaper
	 */
	public String getPublisher(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PUBLISHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publisher</code> attribute.
	 * @return the publisher - Publisher of the book/magazine/newspaper
	 */
	public String getPublisher()
	{
		return getPublisher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher - Publisher of the book/magazine/newspaper
	 */
	public void setPublisher(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PUBLISHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publisher</code> attribute. 
	 * @param value the publisher - Publisher of the book/magazine/newspaper
	 */
	public void setPublisher(final String value)
	{
		setPublisher( getSession().getSessionContext(), value );
	}
	
}
