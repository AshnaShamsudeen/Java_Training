package abstraction;

public class ItemMain {

	public static void main(String[] args) {
		//WrittenItem item1=new WrittenItem(001,"Harry Potter",7,"wow");
		Book b=new Book(001,"Harry Potter",7,"wow");
		b.print();
		b.checkIn();
		//item1.print();
		Video v1=new Video("yes","dddd",5);
		v1.print();
		CD c1=new CD(1,"dddd","wow");
		c1.print();
		//MediaItem m1=new MediaItem(9);
		//m1.print();
		

	}

}
