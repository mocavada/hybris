/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 16, 2020 7:23:14 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;
import my.bookstore.core.jalo.Book;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product EBook}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEBook extends Book
{
	/** Qualifier of the <code>EBook.updates</code> attribute **/
	public static final String UPDATES = "updates";
	/** Qualifier of the <code>EBook.encoding</code> attribute **/
	public static final String ENCODING = "encoding";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Book.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(UPDATES, AttributeMode.INITIAL);
		tmp.put(ENCODING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.encoding</code> attribute.
	 * @return the encoding - Ebook Encoding
	 */
	public String getEncoding(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENCODING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.encoding</code> attribute.
	 * @return the encoding - Ebook Encoding
	 */
	public String getEncoding()
	{
		return getEncoding( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.encoding</code> attribute. 
	 * @param value the encoding - Ebook Encoding
	 */
	public void setEncoding(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENCODING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.encoding</code> attribute. 
	 * @param value the encoding - Ebook Encoding
	 */
	public void setEncoding(final String value)
	{
		setEncoding( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.updates</code> attribute.
	 * @return the updates - Ebook Updates
	 */
	public Boolean isUpdates(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, UPDATES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.updates</code> attribute.
	 * @return the updates - Ebook Updates
	 */
	public Boolean isUpdates()
	{
		return isUpdates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.updates</code> attribute. 
	 * @return the updates - Ebook Updates
	 */
	public boolean isUpdatesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUpdates( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EBook.updates</code> attribute. 
	 * @return the updates - Ebook Updates
	 */
	public boolean isUpdatesAsPrimitive()
	{
		return isUpdatesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.updates</code> attribute. 
	 * @param value the updates - Ebook Updates
	 */
	public void setUpdates(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, UPDATES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.updates</code> attribute. 
	 * @param value the updates - Ebook Updates
	 */
	public void setUpdates(final Boolean value)
	{
		setUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.updates</code> attribute. 
	 * @param value the updates - Ebook Updates
	 */
	public void setUpdates(final SessionContext ctx, final boolean value)
	{
		setUpdates( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EBook.updates</code> attribute. 
	 * @param value the updates - Ebook Updates
	 */
	public void setUpdates(final boolean value)
	{
		setUpdates( getSession().getSessionContext(), value );
	}
	
}
