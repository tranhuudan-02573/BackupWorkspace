package cau2_Art;

public class Painting extends ArtObject {
	private String paintType;
	private String style;

	public Painting() {
	}

	public Painting(String title, String artist, int year, String paintType, String style) {
		super(title, artist, year);
		this.paintType = paintType;
		this.style = style;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title + "\t" + artist + "\t" + year + "\t" + paintType + "\t" + style;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
