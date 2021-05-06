package Main;

import java.util.Date;

import javax.xml.namespace.QName;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import adapters.MernisServiceAdapter;

public class CustomerManagent {

	public static void main(String[] args) {
		Customer customer=new Customer("Melek","Tiftik",new Date(1996,11,29),"36529957624");
		BaseCustomerManager nero=new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			nero.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
