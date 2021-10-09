package cau3_OOP;

public class SavingAccount extends Account {
	private int interestestRate;

	public SavingAccount(String name, int id, int interestestRate, double currentBalace) {
		super(id, name, currentBalace);
		this.interestestRate = interestestRate;
	}

	@Override
	public String toString() {
		return name + "\t\t"+ id  + "\t\t" + interestestRate + "\t\t" + currentBalace;
	}
}
