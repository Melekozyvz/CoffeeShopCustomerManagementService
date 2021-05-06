package Concrete;

import Abstract.CustomerService;
import Abstract.CustomerServiceCheck;
import Entities.Customer;

public class CustomerCheckManager implements CustomerServiceCheck {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	

}
