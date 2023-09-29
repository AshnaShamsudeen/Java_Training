package inheritance;

public class MediaItem extends Item{
	private int runTime;
	
	

	public MediaItem(int runTime) {
		//super();
		this.runTime = runTime;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItem(int id_number, String title, int num_copy) {
		super(id_number, title, num_copy);
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		//super.print();
		System .out.println("runTime: "+runTime );
	}
	

}
