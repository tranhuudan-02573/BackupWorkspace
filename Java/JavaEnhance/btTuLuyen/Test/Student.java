package Test;

public class Student {
	private String id;
	private String fullName;
	private boolean isFemale; // la nu
	private String provide_city; // tinh thanh pho
	private int covid_Vacxin; // so mui covid dc da tiem

	public Student(String id, String fullName, boolean isFemale, String provide_city, int covid_Vacxin) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.isFemale = isFemale;
		this.setProvide_city(provide_city);
		this.setCovid_Vacxin(covid_Vacxin);
	}


	public String toString() {
		// TODO
		/*
		 * SV tu viet phuong thuc to string
		 */
		return "Student~id:" + id + ";\n	fullName:" + fullName + ";\n	isFemale:" + isFemale + ";\n	city_provide:" + getProvide_city() + ";\n	covid_Vacxin:" + getCovid_Vacxin() + ".";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tao 1 Object la chinh cac ban de test
		 */
		System.out.println(new Student("20130346", "Tran Duy Nhan", false, "Quang Binh", 0));
	}


	public String getProvide_city() {
		return provide_city;
	}


	public void setProvide_city(String provide_city) {
		this.provide_city = provide_city;
	}


	public int getCovid_Vacxin() {
		return covid_Vacxin;
	}


	public void setCovid_Vacxin(int covid_Vacxin) {
		this.covid_Vacxin = covid_Vacxin;
	}

}
