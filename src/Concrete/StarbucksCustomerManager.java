package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Abstract.CustomerServiceCheck;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerServiceCheck customerCheckService;
	
	public StarbucksCustomerManager(CustomerServiceCheck customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {

		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);

		} else throw new Exception("Not a real person");
	}

	
	

}
