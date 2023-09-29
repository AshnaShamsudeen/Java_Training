package SetDemo;
import java.util.HashSet;
import java.util.Set;


public class Customer2Repository {
	
	Set<SetCustomer> customers = new HashSet<>();
	//create a method to add a new customer
	public void addCustomer(SetCustomer c) throws DuplicateCustomerException{
		for(SetCustomer cust:customers) {
			if(cust.getId()==c.getId()) {
				throw new DuplicateCustomerException("duplicate found "+c.getId());
			}
		}
		
		customers.add(c);
	}
	
	//create a method to get all the customers
	public Set<SetCustomer> getAllCustomer() {
		return customers;
	}
	public SetCustomer getCustomerByName(String name) throws NameNotFoundException{
		for(SetCustomer c:customers) {
			if(c.getName().equalsIgnoreCase(name)) {
				return c;
			}
			throw new NameNotFoundException("name not found ");
		}
		return null;
		
	}
	public SetCustomer getCustomerById(int id) {
		for(SetCustomer c:customers) {
			if(c.getId()==id) {
				return c;
				
				
			}
			
		
	}
		return null;
	}
		public void deleteCustomer(int id) {
			SetCustomer c=getCustomerById(id);
			customers.remove(c);
		
		

}
}




