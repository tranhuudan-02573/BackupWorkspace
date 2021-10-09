package bai5_9;

import junit.framework.TestCase;

public class LoGradeTest extends TestCase {

	public void testScoreBoard() {
		Course c1 = new Course(1, "Math A1", 3);
		Course c2 = new Course(2, "Math A2", 3);
		Course c3 = new Course(3, "Physics", 3);
		GradeRecord g1 = new GradeRecord(c1, 12.0);
		GradeRecord g2 = new GradeRecord(c2, 12.0);
		GradeRecord g3 = new GradeRecord(c3, 12.0);
		ILoGrade empty = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g3, empty);
		ILoGrade l2 = new ConsLoGrade(g2, l1);
		ILoGrade l3 = new ConsLoGrade(g1, l2);
		new ScoreBoard("A", "DTC", l3);
	}

	public void testHowManyCredits() {
		Course c1 = new Course(1, "Math A1", 3);
		Course c2 = new Course(2, "Math A2", 3);
		Course c3 = new Course(3, "Physics", 3);
		GradeRecord g1 = new GradeRecord(c1, 12.0);
		GradeRecord g2 = new GradeRecord(c2, 12.0);
		GradeRecord g3 = new GradeRecord(c3, 12.0);
		ILoGrade empty = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g3, empty);
		ILoGrade l2 = new ConsLoGrade(g2, l1);
		ILoGrade l3 = new ConsLoGrade(g1, l2);
		ScoreBoard table = new ScoreBoard("A", "DTC", l3);
		assertEquals(table.howManyCredits(), 9.0, 0.01);
	}

	public void testGradeAverange() {
		Course c1 = new Course(1, "Math A1", 3);
		Course c2 = new Course(2, "Math A2", 3);
		Course c3 = new Course(3, "Physics", 3);
		GradeRecord g1 = new GradeRecord(c1, 9.0);
		GradeRecord g2 = new GradeRecord(c2, 8.0);
		GradeRecord g3 = new GradeRecord(c3, 6.0);
		ILoGrade empty = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g3, empty);
		ILoGrade l2 = new ConsLoGrade(g2, l1);
		ILoGrade l3 = new ConsLoGrade(g1, l2);
		ScoreBoard table = new ScoreBoard("A", "DTC", l3);
		assertEquals(table.gradeAverange(), 7.66, 0.01);
	}

	public void testSortByGradeDec() {
		Course c1 = new Course(1, "Math A1", 3);
		Course c2 = new Course(2, "Math A2", 3);
		Course c3 = new Course(3, "Physics", 3);
		GradeRecord g1 = new GradeRecord(c1, 9.0);
		GradeRecord g2 = new GradeRecord(c2, 10.0);
		GradeRecord g3 = new GradeRecord(c3, 6.0);
		ILoGrade empty = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g3, empty);
		ILoGrade l2 = new ConsLoGrade(g2, l1);
		ILoGrade l3 = new ConsLoGrade(g1, l2);
		ScoreBoard table = new ScoreBoard("A", "DTC", l3);
		assertEquals(table.sortByGradeDec().getGrade(), "10.0 9.0 6.0 ");
	}

	public void testGreaterThanList() {
		Course c1 = new Course(1, "Math A1", 3);
		Course c2 = new Course(2, "Math A2", 3);
		Course c3 = new Course(3, "Physics", 3);
		GradeRecord g1 = new GradeRecord(c1, 9.0);
		GradeRecord g2 = new GradeRecord(c2, 10.0);
		GradeRecord g3 = new GradeRecord(c3, 6.0);
		ILoGrade empty = new MTLoGrade();
		ILoGrade l1 = new ConsLoGrade(g3, empty);
		ILoGrade l2 = new ConsLoGrade(g2, l1);
		ILoGrade l3 = new ConsLoGrade(g1, l2);
		new ScoreBoard("A", "DTC", l3);
		assertEquals(l3.greaterThanList(6.0D).getGrade(), "9.0 10.0 ");
	}
}
