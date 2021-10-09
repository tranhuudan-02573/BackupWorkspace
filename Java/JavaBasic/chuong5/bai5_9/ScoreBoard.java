package bai5_9;

public class ScoreBoard {
	private String name;
	private String classs;
	private ILoGrade loGrade;

	// constructor
	public ScoreBoard(String name, String classs, ILoGrade loGrade) {
		this.name = name;
		this.classs = classs;
		this.loGrade = loGrade;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}

	public ILoGrade getLoGrade() {
		return loGrade;
	}

	public void setLoGrade(ILoGrade loGrade) {
		this.loGrade = loGrade;
	}

	public double howManyCredits() {
		return this.loGrade.howManyCredits();
	}

	public double gradeAverange() {
		return this.loGrade.gradeAverange();
	}

	public ILoGrade sortByGradeDec() {
		return this.loGrade.sort();
	}
}
