package Printer;

public class PrinterMain {

	public static void main(String[] args) {
		HpPrinter p= new HpPrinter();
		p.print();
		CanonPrinter s= new CanonPrinter();
		s.print();
		s.scan();

	}

}
