package com.customerapp.repository;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import com.customerapp.model.SetCustomer;

public class CustomerRepoImpl implements CustomerRepo{
	Map<Integer,SetCustomer> customerdb=new HashMap<>();

	@Override
	public SetCustomer addCustomer(SetCustomer c) {
		/*SetCustomer c1=new SetCustomer("yadu",010,"yadu@123");
		SetCustomer c2=new SetCustomer("feril",070,"feril@123");
		SetCustomer c3=new SetCustomer("abhi",001,"abhi@123");
		customerdb.add(c1);
		customerdb.add(c2);
		customerdb.add(c3);
		customerdb.add(c);*/
		
		// TODO Auto-generated method stub
		customerdb.put(c.getId(),c);
		return c;
	}

	@Override
	public SetCustomer getCustomerById(int id) {
		/*for(SetCustomer c:customerdb) {
			if(c.getId()==(id)) {
				System.out.println("Customer Found"+c);*/
		return customerdb.get(id);
				//return c;
			}
		//}
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public SetCustomer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		for(SetCustomer c:customerdb.values()) {
			if(c.getName().equalsIgnoreCase(name)) {
				//System.out.println("Customer Found"+c);
				return c;
			}
		}
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		//for(SetCustomer c:customerdb) {
			//if(c.getId()==(id)) {
		//SetCustomer c=getCustomerById(id);
				customerdb.remove(id);
			}
		
		//}
		// TODO Auto-generated method stub
		
	//}

	@Override
	public List<SetCustomer> getAllCustomers() {
		// TODO Auto-generated method stub
		return new ArrayList<>(customerdb.values());
	}

	//@Override
	public SetCustomer searchCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
