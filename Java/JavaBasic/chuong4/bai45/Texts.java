package bai45;

public class Texts extends AGallery{// văn bản 
	private int numberOfLines;// số dòng 
	// contructor
	public Texts(String nameSourceFile, double sizes, int numberOfLines) {
		super(nameSourceFile, sizes);
		this.numberOfLines = numberOfLines;
	}
	// getter and setter
	public int getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}
	

}
