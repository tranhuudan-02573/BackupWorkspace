package bai5_3;

public class GradeRecord {
	private Course course;
	private double grade;
	// constructor
	public GradeRecord(Course course, double grade) {
		super();
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
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	// toString
	public String toString() {
		return this.course.toString() + "\ngrade: " + this.grade;
	}
	
}
