package bai16;

public class Author { // tác giả
	private String name; // tên
	private int birthYear; // năm sinh
	// contructor
	public Author(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}	
	
	
}
