package bai5_9;

public class MTLoGrade implements ILoGrade {
	

	public double howManyCredits() {
		return 0.0;
	}

	public double sumScore() {
		return 0.0;
	}

	public ILoGrade sort() {
		return new MTLoGrade();
	}

	public ILoGrade insert(GradeRecord that) {
		return new ConsLoGrade(that, this.sort());
	}

	public ILoGrade greaterThanList(double thatGrade) {
		return new MTLoGrade();
	}

	public double gradeAverange() {
		return 0.0;
	}

	public String getGrade() {
		return "";
	}
}
