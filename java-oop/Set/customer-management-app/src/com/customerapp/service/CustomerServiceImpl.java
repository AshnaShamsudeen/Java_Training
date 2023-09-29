package com.customerapp.service;
import java.util.List;
import com.customerapp.model.SetCustomer;
import com.customerapp.repository.CustomerRepo;
import com.customerapp.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService{
	CustomerRepo repo=new CustomerRepoImpl();
	@Override
	public SetCustomer addCustomer(SetCustomer c) {
		
		//logic to validate customer data
		return repo.addCustomer(c);
	}

	@Override
	public SetCustomer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return repo.getCustomerById(id);
	}

	@Override
	public SetCustomer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return repo.getCustomerByName(name);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		 repo.deleteCustomer(id);
		
	}

	@Override
	public List<SetCustomer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.getAllCustomers();
	}

	@Override
	public SetCustomer searchCustomer(int id) {
		// TODO Auto-generated method stub
		return repo.searchCustomer(id);
	}

}
