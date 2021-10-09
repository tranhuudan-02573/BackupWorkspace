package StManagement;

public class Subject {
	private int id;
	private String name;
	private int credit;
	private double score;

	public Subject(int id, String name, int credit, double score) {
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.score = score;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", credit=" + credit + ", score=" + score + "]";
	}

}
