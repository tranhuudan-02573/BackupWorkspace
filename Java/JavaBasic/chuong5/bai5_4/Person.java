package bai5_4;

public class Person {
	private Parents parents;
	// constructor
	public Person(Parents parents) {
		super();
		this.parents = parents;
	}
	// getter and setter
	public Parents getParent() {
		return parents;
	}
	public void setParent(Parents parents) {
		this.parents = parents;
	}
	// toString
	public String toString() {
		return this.parents.toString();
	}

}
