package Practice_assigment_java3;

public class song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	
	song(String title,String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
}


	public void show1() {
		System.out.println(year+"년"+country+"국적의"+artist+"가 부른"+title);
	}
}
