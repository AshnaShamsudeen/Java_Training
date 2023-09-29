package lambdaexpression;

interface Printable{
	void print();
}
//class Printer implements Printable{
//	public void print()
//	{
//		System.out.println("Hey printer");
//	}}
	public class LambdaExample {
		public static void main(String[]args) {
//			Printable p =new Printable()
//					{public void print() {
//						System.out.println("Printing..args."");
//					}
//				
//					
//	};
			Printable p=() ->System.out.println("Hello printer");//this is called lambda expression ..here we simplify the interface expressions
			//lamda expression is only possible for single abstract method which is called functional inteface
			p.print();
}}
