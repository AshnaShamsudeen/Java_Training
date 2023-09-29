package collectionsSort;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


import SetDemo.SetCustomer;


public class SortingCollection {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,45,30,25,6);
		List<String> names = Arrays.asList("ash","yadu","shy","abhi");
		//will be printed in the order inserted
		System.out.println(nums);
		System.out.println(names);
		//sorting the list
		Collections.sort(nums);
		Collections.sort(names);
		
		System.out.println("after sorting: " +nums);
		System.out.println("after sorting: " +names);
		
		//sorting a list of customer
		List<SetCustomer> customer =new ArrayList<>();
		//creating a customer object
	      SetCustomer c1=new SetCustomer("ashna",1029,"ash@yahoo.com");
	      SetCustomer c2=new SetCustomer("shyma",1020,"shyma@yahoo.com");
	      SetCustomer c3=new SetCustomer("yadu",1026,"yadu@yahoo.com");
	      SetCustomer c4=new SetCustomer("abhi",1024,"abhi@yahoo.com");
	      //Adding new customer
	      customer.add(c1);
	      customer.add(c2);
	      customer.add(c3);
	      customer.add(c4);
	      for(SetCustomer c:customer) {
	    	  System.out.println(c);}
	    	  Collections.sort(customer);
	    	  for(SetCustomer c:customer) {
		    	  System.out.println(c);
	      }
		
		

	}

}
