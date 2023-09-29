package exception;

public class ExceptionDemo {
	public static void main(String []args) {
		System.out.println("Hello");
		int x,y;
		x=10;
		//y=2;  "working"
		y=0;//ecxeption
		System.out.println("Dividing " +x+" by " +y);
		//if(y>0)//exception handling
		try
		{int result=x/y;
		System.out.println("result: " +result);}
		catch(ArithmeticException ex)
		{
			System.out.println("Error: "+ex.getMessage());
		}
		System.out.println("program executed");
		System.out.println("bye");
		
		
	}

}
