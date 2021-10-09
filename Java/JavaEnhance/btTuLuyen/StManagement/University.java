package StManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {
	private String name;
	private List<Student> students;

	public University(String name) {
		this.name = name;
		this.students = new ArrayList<Student>();
	}

	// deligate -> ủy quyền: dữ liệu lớp nào tự lớp đó phải có phương thức xử lí dữ
	// liệu của nó lớp khác muốn truy cập dữ liệu của lớp đó để xử lý thì gọi phương
	// thức đó ra

	public void addStudent(int stId, String name, int day, int month, int year) {
		Student st = findById(stId);
		if (st == null) {
			st = new Student(stId, name, day, month, year);
			this.students.add(st);
		}
	}

	public Student findById(int stid) {
		for (Student st : this.students)
			if (st.getStId() == stid)
				return st;
		return null;
	}

	public void addSubject(int stId, int id, String name, int credit, double score) {
		Student st = findById(stId);
		if (st != null) {
			st.addSubject(id, name, credit, score);
		}
	}

	public double getAverage(int stId) {
		Student st = findById(stId);
		if (st != null) {
			return st.getAverage();
		}
		return 0.0;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public List<Student> sortByAverage() {
		Comparator<Student> byAverage = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o2.getAverage() - o1.getAverage());
			}
		};

		Collections.sort(this.students, byAverage);
		return this.students;
	}

	public List<Student> sortByDate() {
		Comparator<Student> byDate = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getBirthDate().c.compareTo(o2.getBirthDate());
			}
		};
		Collections.sort(this.students, byDate);
		return this.students;
	}
}
