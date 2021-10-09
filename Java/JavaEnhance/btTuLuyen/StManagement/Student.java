package StManagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int stId;
	private String name;
	private BirthDate bDate;
	private List<Subject> subjects;

	public Student(int stId, String name, BirthDate bDate) {
		this.stId = stId;
		this.name = name;
		this.bDate = bDate;
		this.subjects = new ArrayList<Subject>();
	}

	public Student(int stId, String name, int day, int month, int year) {
		this(stId, name, new BirthDate(day, month, year));// this mở ngoặc là gọi phương thức khác
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSubject(int id, String name, int credit, double score) {
		this.subjects.add(new Subject(id, name, credit, score));
	}

	public double getAverage() {
		if (this.subjects.isEmpty())
			return 0.0;

		int totalCredit = 0;
		double totalScore = 0;
		for (Subject su : this.subjects) {
			totalCredit += su.getCredit();
			totalScore += su.getCredit() * su.getScore();
		}
		return totalScore / totalCredit;
	}

	public BirthDate getBirthDate() {
		return this.bDate;
	}
//	public String toString() {
//		return this.stId + "\t" + this.name + "\t" + this.bDate.toString() + "\t" + this.getAverage();
//	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", name=" + name + ", bDate=" + bDate.toString() + ",\n" + subjects.toString()
				+ ",\n" + "average=" + this.getAverage() + "];";
	}

}
