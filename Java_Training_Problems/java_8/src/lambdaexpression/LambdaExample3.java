package lambdaexpression;
//interface EvenOrOdd{

//	boolean evenOdd(int x);}
//	interface Length{
//		int lengthOfString(String str);
//		interface Divisible{
//			boolean isDivisible(int y,int k);
//	
//}
//public class LambdaExample3 {
//
//	public static void main(String[] args) {
//		// find the length of a string
//		//int getLength(String str)
//		
//		Length s=(str)->str.length();
//		int result1=s.lengthOfString("Happy");
//		System.out.println("the string length is: "result1);
//		
//		//check if a number is even or odd
//		EvenOrOdd  e=(x)->{
//			boolean result=false;
//			if(x%2==0) {
//				result=true;
//				return result;
//			}
//			else
//			{
//				return result;
//			}
//			
//		};
//		boolean result=e.evenOdd(18);
//		System.out.println("the number entered is even: "+result);
//		
//		//find if a number is divisible by another number 
//		
//		Divisible 
//
//	}
//
//}

interface StringLength {
	int getLength(String str);
}

interface EvenOrOdd {
	boolean evenOdd(int x);

}

interface Divisibility {
	boolean Divisible(int x, int y);
}

public class LambdaExample3 {

	public static void main(String[] args) {
// Find the length of a string
// int getLength(String str)

		StringLength s = (str) -> str.length();
		int result1 = s.getLength("Yadukrishnan");
		System.out.println(result1);

// check if a number is even or odd

		EvenOrOdd e1 = (x) -> x % 2 == 0;
		boolean result2 = e1.evenOdd(21);
		System.out.println("The Given number is even : " + result2);

// find if a number is divisible by another number

		Divisibility d = (x, y) -> x % y == 0;
		boolean result3 = d.Divisible(20, 10);
		System.out.println("The numbers are completly Divisible : " + result3);
	}

}
