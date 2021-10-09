package bai41;

import junit.framework.TestCase;

public class BankAccountTest extends TestCase {
	public void testABankAccount() {
		ABankAccount bank1 = new Checking("Earl Gray", "id# 1729", 1250, 500);
		ABankAccount bank2 = new Deposit("Ima flatt", "id# 4104", 10123, "4%", new Maturity(1, "June", 2005));
		ABankAccount bank3 = new Saving("Annie Proulx", "id# 2992", 800, "3,5%");
	}
	
	

}
