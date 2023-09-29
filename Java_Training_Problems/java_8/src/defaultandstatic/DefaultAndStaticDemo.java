package defaultandstatic;
interface Printable{
	void print();
	default void scan()//inside an interface all the methods will be either public or abstracy
{
		System.out.println("Default Scanning..");}

static void show() {
	System.out.println("Hello world");
}}
class Printer implements Printable{
	public void print()
{
		System.out.println("Hello");}

	public void scan() {
	System.out.println("I can Scan...");
}
}
//we can't create an object of an interface .we have to create a class and implement the interface
public class DefaultAndStaticDemo {

	public static void main(String[] args) {
		Printer p=new Printer();
		p.print();
		p.scan();
		Printable.show();
	}
}
