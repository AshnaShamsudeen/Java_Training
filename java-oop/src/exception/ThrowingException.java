package exception;
import java.util.*;

public class ThrowingException {
	static int age;

		public static void readUserAge() throws Exception{
			//whenever we use checked exception we must have to give "throws exception"
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age: ");
				age=sc.nextInt();
		if(age <= 0) {
			//throw new ArithmeticException("age should be a +ve value");
			throw new Exception("age should be a +ve value");
		}
		
		}
		public static void main(String[] args) {
			try {
			readUserAge();
			System.out.println("Age = "+age);}
			//catch(ArithmeticException e)
			catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
			

	}

}
