package abstraction;

public class Book extends WrittenItem {
	public void print()
	{
		super.print();
		System .out.println("Book1" );
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id_num, String title, int num_copy, String author) {
		super(id_num, title, num_copy, author);
		// TODO Auto-generated constructor stub
	}

	public Book(String author) {
		super(author);
		// TODO Auto-generated constructor stub
	}
	
	
}
	
	
	