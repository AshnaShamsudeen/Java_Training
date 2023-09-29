import java.util.Scanner;

class Exercise3{
	public static void main(String []args)
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("Input 5 numbers:");
	int num1= scan.nextInt();
	int num2=scan.nextInt();
	int num3=scan.nextInt();
	int num4=scan.nextInt();
	int num5=scan.nextInt();

	int sum=num1+num2+num3+num4+num5;
	float avg=sum/5;
	System.out.println("Sum ="+sum);
	System.out.println("Sum ="+avg);

	}

}