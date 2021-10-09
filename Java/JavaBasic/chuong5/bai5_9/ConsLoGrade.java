package bai5_9;

public class ConsLoGrade implements ILoGrade {
	private GradeRecord first;
	private ILoGrade rest;

	// constructor
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public GradeRecord getFirst() {
		return first;
	}

	public void setFirst(GradeRecord first) {
		this.first = first;
	}

	public ILoGrade getRest() {
		return rest;
	}

	public void setRest(ILoGrade rest) {
		this.rest = rest;
	}

	public String getGrade() {
		return this.first.getGrade() + " " + this.rest.getGrade();
	}

	public double howManyCredits() {
		return this.first.getCredit() + this.rest.howManyCredits();
	}

	public double sumScore() {
		return this.first.getScore() + this.rest.sumScore();
	}

	public double gradeAverange() {
		return this.sumScore() / this.howManyCredits();
	}

	public ILoGrade sort() {
		return this.rest.sort().insert(this.first);
	}

	public ILoGrade insert(GradeRecord that) {
		return this.first.compareGrade(that) ? new ConsLoGrade(this.first, this.rest.insert(that))
				: new ConsLoGrade(that, this.rest.insert(this.first));
	}

	public ILoGrade greaterThanList(double thatGrade) {
		return (ILoGrade) (this.first.isLager(thatGrade)
				? new ConsLoGrade(this.first, this.rest.greaterThanList(thatGrade))
				: this.rest.greaterThanList(thatGrade));
	}
}