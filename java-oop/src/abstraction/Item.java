package abstraction;

public abstract class Item {
	private int id_number;
	private String title;
	private int num_copy;
	
	public  Item() {
		
	}
	public Item(int id_number, String title, int num_copy) {
		this.id_number = id_number;
		this.title = title;
		this.num_copy = num_copy;
	}
	public int getId_number() {
		return id_number;
	}
	public void setId_number(int id_number) {
		this.id_number = id_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum_copy() {
		return num_copy;
	}
	public void setNum_copy(int num_copy) {
		this.num_copy = num_copy;
	}
	public abstract void checkIn();
	//{
		//System.out.println("Checkin");
	//}
	
	public void checkOut()
	{
		System.out.println("CheckOut");
	}
	public void addItem()
	{
		System.out.println("Item added");
	}
	
	public void print() {
		System.out.println("Identification number: "+id_number);
		System.out.println("Title: "+title);
		System.out.println("No. of copies: "+num_copy);
	}
}
