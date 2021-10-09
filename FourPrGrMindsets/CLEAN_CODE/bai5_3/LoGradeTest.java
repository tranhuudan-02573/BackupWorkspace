package bai5_3;

import junit.framework.TestCase;

public class LoGradeTest extends TestCase{
	public void testLoGrade() {
		Course c1 = new Course(211, "toan a3", 3);
		Course c2 = new Course(311, "LTNC", 4);
		Course c3 = new Course(211, "nhap mon HDH", 3);
		
		GradeRecord g1 = new GradeRecord(c1, 9.0);
		GradeRecord g2 = new GradeRecord(c2, 8.0);
		GradeRecord g3 = new GradeRecord(c3, 10.0);
		
		ILoGrade l1 = new MTLoGrade();
		ILoGrade l2 = new ConsLoGrade(g1, l1);
		ILoGrade l3 = new ConsLoGrade(g2, l2);
		ILoGrade l4 = new ConsLoGrade(g3, l3);
	
		ScoreBoard s1 = new ScoreBoard("tran huu dan", "DH20DTA", l4);
		System.out.println(s1);
	}

}
