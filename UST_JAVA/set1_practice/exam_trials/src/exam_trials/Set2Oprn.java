package exam_trials;

import java.util.Scanner;

public class Set2Oprn {
	static int getSum(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		return sum;
	}
	static int getProduct(int a, int b) {
		int product=1;
		for(int i=a;i<=b;i++) {
			product*=i;
		}
		return product;
		
	}
	static int getSumOfEvens(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
			sum+=i;}
		}
		return sum;
		
		
	}
	static int getSumOfOdd(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
			sum+=i;}
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting limit");
		int a=sc.nextInt();
		System.out.println("enter the starting limit");
		int b=sc.nextInt();
		System.out.println("sum is: "+getSum(a,b));
		System.out.println("product is: "+getProduct(a,b));
		System.out.println("sum of even no.s: "+getSumOfEvens(a,b));
		System.out.println("sum of odd no.s: "+getSumOfOdd(a,b));
		
	}

}
