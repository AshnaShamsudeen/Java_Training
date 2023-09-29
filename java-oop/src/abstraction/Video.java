package abstraction;

public class Video extends MediaItem {
	private String artist;
	private String genre;
	private int year_released;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(String artist, String genre, int year_released) {
		super();
		this.artist = artist;
		this.genre = genre;
		this.year_released = year_released;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear_released() {
		return year_released;
	}
	public void setYear_released(int year_released) {
		this.year_released = year_released;
	}

	public void print() {
		//super.print();
		System.out.println("artist "+artist);
		System.out.println("genre: "+genre);
		System.out.println("year released "+year_released);
	}
	public void checkIn()
	{
		System.out.println("Checkin");
	}
	
	
	

}
