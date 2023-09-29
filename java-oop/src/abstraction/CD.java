package abstraction;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(int runTime,String artist, String genre) {
		super(runTime);
		this.artist = artist;
		this.genre = genre;
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
	
	public void print() {
		super.print();
		System.out.println("artist "+artist);
		System.out.println("genre: "+genre);
	}
	public void checkIn()
	{
		System.out.println("Checkin");
	}

}
