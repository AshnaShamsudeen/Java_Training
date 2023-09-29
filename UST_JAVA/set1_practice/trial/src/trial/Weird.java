package trial;

import java.util.Scanner;

public class Weird {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        if(num%2!=0) {
        	System.out.println("Weird");
        }
        else {
        	if(num<=25 && num>=1) {
        		System.out.println("Not Weird");
        	}
        	else if(num>26 && num<50) {
        		System.out.println("Weird");
        		
        	}
        	else if(num>50) {
        		System.out.println("Not Weird");
        		
        	}
        }


	}

}
