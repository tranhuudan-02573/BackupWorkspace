package cau3_OOP;

public class Account {
	protected int id;
	protected String name;
	protected double currentBalace;

	public Account(int id, String name, double currentBalace) {
		super();
		this.id = id;
		this.name = name;
		this.currentBalace = currentBalace;
	}
}
