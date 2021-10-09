package qlttsv;

import java.util.Vector;

public class Student {
	String id, name;
	double score;

	public Student(String id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Object[] getRow() {
		return new Object[] { id, name, score };

	}

}
