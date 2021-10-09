package bai5_9;

public interface ILoGrade {
	public double howManyCredits();

	public double sumScore();

	public double gradeAverange();

	public ILoGrade sort();

	public ILoGrade insert(GradeRecord var1);

	public ILoGrade greaterThanList(double var1);

	public String getGrade();
}
