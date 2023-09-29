package com.customerapp.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.customerapp.model.SetCustomer;


class CustomerServiceImplTest {
	CustomerServiceImpl service;
	
	@BeforeEach
	public void setUp() {
		service= new CustomerServiceImpl();
	
	}

	@Test
	void testAddCustomer() {
		SetCustomer c = new SetCustomer("appukuttan",1000,"appu@.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(1000));
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetCustomerById() {
		
		SetCustomer c = new SetCustomer("appukuttan",1000,"appu@.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(1000));
		//fail("Not yet implemented");
	}

	@Test
	void testGetCustomerByName() {
		SetCustomer c = new SetCustomer("appukuttan",1000,"appu@.com");
		service.addCustomer(c);
		assertEquals(c,service.getCustomerByName("appukuttan"));
		//fail("Not yet implemented");
		
	}

	@Test
	void testDeleteCustomer() {
		SetCustomer c = new SetCustomer("appukuttan",1000,"appu@.com");
		service.addCustomer(c);
		service.deleteCustomer(1000);
		assertNull(service.getCustomerById(1000));
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetAllCustomers() {
		SetCustomer c = new SetCustomer("appukuttan",1000,"appu@.com");
		service.addCustomer(c);
		List<SetCustomer> customerdb=service.getAllCustomers();
		assertTrue(customerdb.size()==1);
		//fail("Not yet implemented");
	}

	//@Test
	void testSearchCustomer() {
		//fail("Not yet implemented");
	}

}
