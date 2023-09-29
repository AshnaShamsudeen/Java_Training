package abstraction;

public abstract class WrittenItem extends Item {
	private String author;

	
	public WrittenItem(int id_num,String title,int num_copy,String author) {
		super(id_num,title,num_copy);
		this.author=author;

}
	public void print()
	{
		super.print();
		System.out.println("author:" +author);
	}
public WrittenItem() {
}
public void checkIn()
{
	System.out.println("Checkin");
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public WrittenItem(String author) {
	//super();
	this.author = author;
}

}
	
	
	
