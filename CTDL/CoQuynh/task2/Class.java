package task2;

import java.util.Arrays;

public class Class {
	private Student[] studentArray;// mang cac sinh vien
	private String name;
	private int quantityStudent;

	public Class(String name, int quantityStudent) {
		super();
		this.name = name;
		this.quantityStudent = quantityStudent;
		this.studentArray = new Student[quantityStudent];
	}

	public Class(Student[] studentArray, String name) {
		super();
		this.studentArray = studentArray;
		this.name = name;
		this.quantityStudent = studentArray.length;
	}

	public void updateStudent(int index, Student s) {
		studentArray[index] = s;
	}

	// Vong for each
	public Student[] getStudentHas2Vacxin() {
		Student[] result = new Student[quantityStudent];
		int index = 0;
		for (Student s : studentArray) {
			if (s.getCovid_Vacxin() == 2) {
				result[index] = s;
				index++; // index = index + 1
			}
		}
		return result;
	}

	// Vong for
	public Student[] getStudentHas2VacxinNormalFor() {
		Student[] result = new Student[quantityStudent];
		int index = 0;
		for (int i = 0; i < quantityStudent; i++) {
			if (studentArray[i].getCovid_Vacxin() == 2) {
				result[index] = studentArray[i];
				index++; // index = index + 1
			}
		}
		return result;
	}

	public Student[] getStudentHasNonVacxin() {
		Student[] result = new Student[quantityStudent];
		int index = 0;
		for (Student s : studentArray) {
			if (s.getCovid_Vacxin() == 0) {
				result[index] = s;
				index++; // index = index + 1
			}
		}
		return result;
	}

	/*
	 * So luong sinh vien tai tinh hoac thanh pho nguoi dung nhan vao
	 */
	public int quantityStudentAt(String province_city) {
		int result = 0;
		for (Student s : studentArray) {
			if (s.getProvide_city() == province_city) {
				result++;
			}
		}
		return result;
	}

	public String printStudentArray(Student[] stdArray) {
		String result = "";
		for (Student s : stdArray) {
			result += s + "\n";
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "Class name: " + this.name + "\n" + "Quantity: " + this.quantityStudent + "\n"
				+ "List student of class:" + "\n";
		result += printStudentArray(studentArray);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SV TAO RA LOP HOC CO 5 SV
		 */
		Student sv1 = new Student("001", "An", false, "Binh Duong", 1);
		Student sv2 = new Student("002", "Binh", false, "TPHCM", 2);
		Student sv3 = new Student("003", "Cuc", true, "TPHCM", 1);
		Student sv4 = new Student("004", "Dung", true, "Binh Duong", 0);
		Student sv5 = new Student("005", "Linh", true, "Dong Nai", 1);
		Student[] arr = { sv1, sv2, sv3, sv4, sv5 };
		Class myClass = new Class(arr, "My Class");
		System.out.println(myClass);

//		Class myClass2 = new Class("My Class 2",5);
//		myClass2.updateStudent(0, sv1);
//		myClass2.updateStudent(1, sv2);
//		myClass2.updateStudent(2, sv3);
//		myClass2.updateStudent(3, sv4);
//		myClass2.updateStudent(4, sv5);
//		System.out.println(myClass2);

		System.out.println(myClass.quantityStudentAt("TPHCM"));
		System.out.println(myClass.printStudentArray(myClass.getStudentHas2Vacxin()));
		System.out.println(myClass.printStudentArray(myClass.getStudentHasNonVacxin()));
	}

}