package bai32;

public class Author { // tác giả
	private String name; // tên
	private int birthYear; // năm sinh  
	// contructor
	public Author(String name, int birthYear) {
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
	// kiểm tra năm sinh của tác giả có lớn hơn bằng 1940 không
	public boolean currentAuthor() { 
		return this.birthYear >= 1940;
	}
	// so sánh 2 tên tác giả có giống nhau không
	public boolean same(Author same) {
		return (this.name.equals(same.name)) && (this.birthYear == same.birthYear);
	}
	// kiểm tra năm sinh của 2 tác giả có chênh lệch nhau quá 10 tuổi không
	public boolean sameGeneration(Author same) {
		return (this.birthYear - same.birthYear) > 10; 
	}
}
