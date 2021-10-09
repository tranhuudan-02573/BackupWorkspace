package Test;

public class Class {
	private static Student[] studentArray;// mang cac sinh vien
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

	public static Student[] getStudentHas2Vacxin() {
		// TODO
		int n = 0;

		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 2) {
				n++;
			}
		}
		Student[] s = new Student[n];
		int m = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 2) {
				s[m] = studentArray[i];
				m++;
			}
		}
		return s;
	}

	public static Student[] getStudentHasNonVacxin() {
		// TODO
		int n = 0;

		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 0) {
				n++;
			}
		}
		Student[] s = new Student[n];
		int m = 0;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getCovid_Vacxin() == 0) {
				s[m] = studentArray[i];
				m++;
			}
		}
		return s;
	}

	/*
	 * So luong sinh vien tai tinh hoac thanh pho nguoi dung nhan vao
	 */
	public int quantityStudentAt(String province_city) {
		// TODO
		int result = 0;
		for (int i = 0; i < studentArray.length; i++) {

			if (studentArray[i].getProvide_city().equals(province_city)) {
				result++;
			}
		}
		return result;
	}

	public void prin(Student[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SV TAO RA LOP HOC CO 5 SV
		 */
		Student st1 = new Student("20130346", "Tran Duy Nhan", false, "Quang Binh", 0);
		Student st2 = new Student("43576434", "Nguyen Hoai Dung", false, "Da Nang", 1);
		Student st3 = new Student("30203232", "Nguyen Manh Hung", false, "Quang Binh", 1);
		Student st4 = new Student("23423092", "Pham Duc Dat", false, "Ho Chi Minh", 0);
		Student st5 = new Student("23423423", "Tran Quang Vinh", false, "Ha Noi", 2);
		Student[] student = { st1, st2, st3, st4, st5 };
		Class cls = new Class("IT", 5);
		Class cl = new Class(student, "a");
		cl.prin(getStudentHasNonVacxin());
		cl.prin(getStudentHas2Vacxin());
		System.out.println(cl.quantityStudentAt("hcm"));
	}

}