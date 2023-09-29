import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.customerapp.model.SetCustomer;
import com.customerapp.service.CustomerServiceImpl;

class CustomerServiceImplTest {
	CustomerServiceImpl service;

	@BeforeEach
	public void setUp() {
		service = new CustomerServiceImpl();

	}

	@Test
	void testAddCustomer() {
		SetCustomer c = new SetCustomer("appukuttan", 1000, "appu@.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(1000));

		// fail("Not yet implemented");
	}

	@Test
	void testGetCustomerById() {

		SetCustomer c = new SetCustomer("appukuttan", 1000, "appu@.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(1000));
		// fail("Not yet implemented");
	}

	@Test
	void testGetCustomerByName() {
		SetCustomer c = new SetCustomer("appukuttan", 1000, "appu@.com");
		service.addCustomer(c);
		assertEquals(c, service.getCustomerByName("appukuttan"));
		// fail("Not yet implemented");

	}

	@Test
	void testDeleteCustomer() {
		SetCustomer c = new SetCustomer("appukuttan", 1000, "appu@.com");
		service.addCustomer(c);
		service.deleteCustomer(1000);
		assertNull(service.getCustomerById(1000));

		// fail("Not yet implemented");
	}

	@Test
	void testGetAllCustomers() {
		SetCustomer c = new SetCustomer("appukuttan", 1000, "appu@.com");
		service.addCustomer(c);
		List<SetCustomer> customerdb = service.getAllCustomers();
		assertTrue(customerdb.size() == 1);
		// fail("Not yet implemented");
	}

	// @Test
	void testSearchCustomer() {
		// fail("Not yet implemented");
	}

}
