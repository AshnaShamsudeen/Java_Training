package com.customerapp.ui;
import java.util.*;

import com.customerapp.model.SetCustomer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class CustomerAppUi {
 static Scanner scan =new Scanner(System.in);
 static CustomerService service = new CustomerServiceImpl();
	public static void addCustomer() {
		System.out.println("Enter the customer details: ");
		System.out.println("id: ");
		int id=scan.nextInt();
		System.out.println("name: ");
		String name=scan.next()+scan.nextLine();
		System.out.println("email: ");
		String email=scan.next()+scan.nextLine();
		SetCustomer c = new SetCustomer(name, id, email);
		service.addCustomer(c);
		System.out.println("Customer added");

		
		
	}
public static void searchCustomerById() {
	System.out.println("enter the element to be searched");
	int y=scan.nextInt();
	service.getCustomerById(y);
}
public static void searchCustomerByName() {
	System.out.println("enter the name to be searched");
	String n=scan.next();
	service.getCustomerByName(n);}


public static void deleteCustomer() {
		System.out.println("enter the id of element to be deleted");
		int p=scan.nextInt();
		service.deleteCustomer(p);
		System.out.println("Successfully deleted");}


public static void getAllCustomers() {
			List<SetCustomer>c1=service.getAllCustomers();
			System.out.println("Customers are: ");
			for(SetCustomer t1:c1) {
			System.out.println(t1);}
		}
	
	
public static void main(String[] args) {
	while(true) {
	
	System.out.println("1:Add customer ");
	System.out.println("2:Search customer by id");
	System.out.println("3:Search customer by name ");
	System.out.println("4:delete customer");
	System.out.println("5:get all customers ");
	System.out.println("0:exit");
	System.out.println("--------------------------------------------");
	System.out.println("Enter your choice: ");
	int choice=scan.nextInt();
	switch(choice) {
	case 1:addCustomer();
	break;
	case 2:searchCustomerById();
	break;
	case 3:searchCustomerByName();
	break;
	case 4:deleteCustomer();
	break;
	case 5:getAllCustomers();
	break;
	case 0:
		System.exit(1);
		break;
	default:
		System.out.println("unexpected value entered");
		break;
	}
	
}
	

}
}
