package cau3_OOP;

public class CheckingAccount extends Account {
	private double minimumBalance;

	public CheckingAccount(String name, int id, double currentBalace, double minimumBalance) {
		super(id, name, currentBalace);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public String toString() {
		return name + "\t\t" + id + "\t\t" + currentBalace + "\t\t" + minimumBalance;
	}
}
