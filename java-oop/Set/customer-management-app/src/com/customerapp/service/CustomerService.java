package com.customerapp.service;

import java.util.List;

import com.customerapp.model.SetCustomer;

public interface CustomerService {
	public SetCustomer searchCustomer(int id);
	public SetCustomer addCustomer(SetCustomer c);
	public SetCustomer getCustomerById(int id);
	public SetCustomer getCustomerByName(String name);
	public void deleteCustomer (int id);
	public List<SetCustomer>getAllCustomers();


}
