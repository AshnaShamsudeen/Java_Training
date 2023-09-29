package exam_trials;

import java.util.Scanner;

public class set4Oprn {
	static double calculateFinalPrice(double basePrice) {
		if(basePrice>100) {
			return basePrice*.9;
		}
		else if(basePrice>500) {
			return basePrice*.8;
		}
		else if(basePrice>1000) {
			return basePrice*.7;
		}
		else if(basePrice>5000) {
			return basePrice*.6;
		}
		return basePrice;
		
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the base price of the product");
	double base=sc.nextDouble();
	System.out.println("the discounted price is: "+calculateFinalPrice(base));
	}

}
