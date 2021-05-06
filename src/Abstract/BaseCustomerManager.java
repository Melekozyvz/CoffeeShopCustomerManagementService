package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService
{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.print("saved to db:"+customer.getFirstName());
	}

}
