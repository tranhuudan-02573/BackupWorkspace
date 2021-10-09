package bai5_9;

public class GradeRecord {
	private Course course;
	private double grade;
	// constructor
	public GradeRecord(Course course, double grade) {
		this.course = course;
		this.grade = grade;
	}
	// getter and setter
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getCredit() {
		return (double) this.course.getCredits();
	}

	public double getScore() {
		return this.getCredit() * this.grade;
	}

	public boolean compareGrade(GradeRecord that) {
		return this.grade > that.grade;
	}

	public boolean isLager(double num) {
		return this.grade > num;
	}

	public double getGrade() {
		return this.grade;
	}
}
