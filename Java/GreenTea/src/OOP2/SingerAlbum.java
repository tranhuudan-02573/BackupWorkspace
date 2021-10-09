package OOP2;

public class SingerAlbum extends AAlbum {

	private String nameSinger;

	// constructor
	public SingerAlbum(String title, int year, String nameSinger, IMusicItems list) {
		super(title, year, list);
		this.nameSinger = nameSinger;
	}

	// getter and setter
	public String getNameSinger() {
		return nameSinger;
	}

	public void setNameSinger(String nameSinger) {
		this.nameSinger = nameSinger;
	}

	@Override
	public String toString() {
		return "SingerAlbum [nameSinger=" + nameSinger + super.toString() + "]";
	}

}
