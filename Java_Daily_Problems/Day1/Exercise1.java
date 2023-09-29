/*Write an algorithm for accepting two numbers, divide the first number by second and display their quotient.*/


import java.util.Scanner;

class Exercise1{
	public static void main(String []args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Input 2 numbers:");
	int num1= sc.nextInt();
	int num2=sc.nextInt();
	int result=num1/num2;
	System.out.println("Result ="+result);
	}

}