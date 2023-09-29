package polymorphism;

import polymorphism.Calculator;

public class CalcMain {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		var output1 =calc.add("UST ","Global");
		 var output2 =calc.add(10,20);
		 var output3 =calc.add(10.5F,20.3F);
		
		 System.out.println("output : "+output1);
		 System.out.println("output : "+output2);
		 System.out.println("output : "+output3);

	}

}
