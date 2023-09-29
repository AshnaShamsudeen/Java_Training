package exam_trials;

import java.util.Scanner;

public class EqnCheck {
	static boolean EquationCheck(int a,int b,int c, int d) {
		if(a*b==c*d) {
			System.out.println("the result is "+a+"*"+b+"="+c+"*"+d);
			return true;
		}
		else if(a==b*c*d) {
			System.out.println("the result is "+a+"="+b+"*"+c+"*"+d);
			return true;
		}
		else if(a*b*c==d) {
			System.out.println("the result is "+a+"*"+b+"*"+c+"="+d);
			return true;
		}
		
		System.out.println("SORRY! NOT POSSIBLE ");
		return false;
	}
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		System.out.println("enter the fourth number");
		int d=sc.nextInt();
		System.out.println(EquationCheck(a,b,c,d));

}
}