package OOP2;

public class GeneralAlbum extends AAlbum {
	// constructor
	public GeneralAlbum(String title, int year, IMusicItems list) {
		super(title, year, list);
	}

	@Override
	public String toString() {
		return "GeneralAlbum [" + super.toString() + "]";

	}

}
