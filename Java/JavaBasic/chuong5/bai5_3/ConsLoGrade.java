package bai5_3;

public class ConsLoGrade implements ILoGrade {
	private GradeRecord first;
	private ILoGrade rest;
	// constructor
	public ConsLoGrade(GradeRecord first, ILoGrade rest) {
		super();
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
	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
}
