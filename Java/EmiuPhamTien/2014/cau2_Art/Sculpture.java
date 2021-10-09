package cau2_Art;

public class Sculpture extends ArtObject {
	private String materialFrom;
	private int heigh;
	private int tweight;

	public Sculpture(String title, String artist, int year, String materialFrom, int heigh, int tweight) {
		super(title, artist, year);
		this.materialFrom = materialFrom;
		this.heigh = heigh;
		this.tweight = tweight;
	}

	@Override
	public String toString() {
		return title + "t" + artist + "\t" + year + "\t" + materialFrom + "\t" + heigh + "\t" + tweight;
	}
}
