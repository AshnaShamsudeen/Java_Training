package exception;
import java.util.*;

public class ExceptionThrow {
	static int age;
	static String name;
	static Scanner sc;

		public static void readUserDetails() throws Exception{
			
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age: ");
				age=sc.nextInt();
				System.out.println("enter user name");
				name=sc.nextLine()+sc.next();
				
				
		
		if(name.length()<3) {
			throw new InvalidNameException("name length should be greater than 3");
		}
		if(age <= 0 ) {
			//throw new ArithmeticException("age should be a +ve value");
			throw new InvalidAgeException("age should be a +ve value");
		}}
		public static void main(String[] args) {
			try {
				readUserDetails();
				System.out.println("Age = "+age);
				System.out.println("name = " +name);}
			//catch(ArithmeticException e)
			catch(Exception e)
			{
				System.err.println(e);
			}
			finally {
				System.out.println("closing resources");
				sc.close();
			}
			

	}

}