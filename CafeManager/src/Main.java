import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Ekrem", "Saglam", null, "123123");
		
		customerManager.Save(customer);
	}

}
