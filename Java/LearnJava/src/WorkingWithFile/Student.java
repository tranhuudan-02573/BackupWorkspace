package WorkingWithFile;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	String gender;

	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + "]";
	}
	public void display() {
		System.out.println(toString());
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
