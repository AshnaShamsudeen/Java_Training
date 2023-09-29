package SetDemo;

import java.util.Set;
import java.util.HashSet;

public class Customer2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Customer2Repository repo= new Customer2Repository();
      //creating a customer object
      SetCustomer c1=new SetCustomer("ashna",1029,"ash@yahoo.com");
      SetCustomer c2=new SetCustomer("shyma",1020,"shyma@yahoo.com");
      SetCustomer c3=new SetCustomer("yadu",1026,"yadu@yahoo.com");
      SetCustomer c4=new SetCustomer("abhi",1024,"abhi@yahoo.com");
      SetCustomer c5=new SetCustomer("ashna",1029,"ash@yahoo.com");
      //Addind a new customer
      try {
    	  
      
      repo.addCustomer(c1);
      repo.addCustomer(c2);
      repo.addCustomer(c3);
      repo.addCustomer(c4);
      repo.addCustomer(c5);
      
      }
      catch(Exception e) {
      System.out.println(e.getMessage());}
      try {
    	  SetCustomer cu=repo.getCustomerByName("kk");
      }
      catch(Exception e) {
          System.out.println(e.getMessage());}
      //getting all customers
      Set<SetCustomer> customers=repo.getAllCustomer();
      //System.out.println(repo.getAllCustomer());
      //display all customers
      
      for(SetCustomer c:customers) {
    	System.out.println(c);
      }
      System.out.println();
      System.out.println();
      //
      repo.deleteCustomer(1020);
      for(SetCustomer c:customers) {
    	  System.out.println(c);
      }
      
	}
	

}

	