package task2;

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
		this.provide_city = provide_city;
		this.covid_Vacxin = covid_Vacxin;
	}

	@Override
	public String toString() {
		return "id=" + id + ", fullName=" + fullName + ", isFemale=" + isFemale + ", provide_city=" + provide_city
				+ ", covid_Vacxin=" + covid_Vacxin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public boolean isFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tao 1 Object la chinh cac ban de test
		 */
		Student tui = new Student("007", "Jame Bond", false, "I don't know", 2);
		System.out.println(tui);
	}

}
