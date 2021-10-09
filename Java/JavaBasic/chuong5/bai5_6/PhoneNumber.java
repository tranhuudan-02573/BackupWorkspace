package bai5_6;

public class PhoneNumber {
	private String name;
	private String number;
	// constructor
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = number;
	}
	// getter and setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return "name: " + this.name;
	}

	public String getNumber() {
		return "number: " + this.number;
	}

	public boolean sameName(String thatName) {
		return this.name.equals(thatName);
	}

	public boolean sameNumber(String thatNumber) {
		return this.number == thatNumber;
	}
}
