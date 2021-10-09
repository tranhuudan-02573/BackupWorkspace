package bai5_3;

public class ScoreBoard {
	private String name;
	private String coat;
	private ILoGrade loGrade;
	// constructor
	public ScoreBoard(String name, String coat, ILoGrade loGrade) {
		super();
		this.name = name;
		this.coat = coat;
		this.loGrade = loGrade;
	}
	// getter and setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoat() {
		return coat;
	}
	public void setCoat(String coat) {
		this.coat = coat;
	}
	public ILoGrade getLoGrade() {
		return loGrade;
	}
	public void setLoGrade(ILoGrade loGrade) {
		this.loGrade = loGrade;
	}
	// toString
	public String toString() {
		return "\nname: " + this.name + "\nclass: " + this.coat + this.loGrade.toString();
	}



}
