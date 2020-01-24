package my.bookstore.core.services.impl;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

import my.bookstore.core.daos.RentalDao;
import my.bookstore.core.model.RentalModel;
import my.bookstore.core.services.RentalService;


public class DefaultRentalService implements RentalService
{
	// TODO exercise 6.4: add rentalDao variable per defaultRentalService bean configuration in bookstorecore-spring.xml
	private RentalDao rentalDao;

	@Override
	public List<RentalModel> getActiveRentalsForCustomer(final CustomerModel customer)
	{
		// TODO exercise 6.4: add implementation
		return rentalDao.getActiveRentalsForCustomer(customer);
	}

	// TODO exercise 6.4: add rentalDao mutator method per defaultRentalService bean configuration in bookstorecore-spring.xml
	/**
	 * @param rentalDao
	 */
	public void setRentalDao(final RentalDao rentalDao)
	{
		this.rentalDao = rentalDao;
	}



}
