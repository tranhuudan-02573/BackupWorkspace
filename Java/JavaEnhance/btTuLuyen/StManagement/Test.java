package StManagement;

import java.util.List;

public class Test {

	public static void display(List<Student> sts) {
		for (Student st : sts)
			System.out.println(st + "\n");
	}

	public static void main(String[] args) {
		University uni = new University("ĐH Nông Lâm");

		uni.addStudent(11111, "Nguyên Văn An", 2, 11, 1999);
		uni.addStudent(22222, "Trần Thị Yến", 30, 1, 1999);
		uni.addStudent(55555, "Lê Phi Hùng", 18, 12, 2000);

		uni.addSubject(11111, 1, "Lập trình căn bản", 4, 5);
		uni.addSubject(11111, 2, "Lập trình nâng cao", 4, 9);

		uni.addSubject(55555, 1, "lập trình căn bản", 4, 10);

		display(uni.getStudents());
		System.out.println("===================");

		display(uni.sortByAverage());

		System.out.println("===================");
		display(uni.sortByDate());
	}

}
