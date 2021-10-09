package OOP4;

import junit.framework.TestCase;

public class BanksAccountTest extends TestCase {
	ATransactions a1 = new withdrawTranssaction("abc123", 5, 50000001);
	ATransactions a2 = new transferTransaction("abc573", 28, "74385634785324", 50000001);
	ATransactions a3 = new depositTransaction("abc123", 25, 75000001);
	ATransactions a4 = new checkBalance("abc123", 10);

	Customer c1 = new Customer(221355476, "tran van k", "quan thu duc tp hcm", 1871);

	ITransactions i1 = new MTTransactions();
	ITransactions i2 = new ConsTransactions(a1, i1);
	ITransactions i3 = new ConsTransactions(a2, i2);
	ITransactions i4 = new ConsTransactions(a3, i3);
	ITransactions i5 = new ConsTransactions(a4, i4);

	BankAccount b1 = new BankAccount("473858346537", c1, "tp hcm", 5000000, i5);
	public void testConstructor() {
		System.out.println("testConstructor");
		System.out.println(b1);
		
		
	}
	public void testFee() {
		System.out.println("testFee");
		System.out.println(a1.fee());
		System.out.println(a2.fee());
		System.out.println(a3.fee());
		System.out.println(a4.fee());
	}
	public void testTotalFee() {
		System.out.println("testTotalFee");
		System.out.println(i5.totalFee());
		
		
	}
	public void testMaxFee() {
		System.out.println("testMaxFee");
		System.out.println(i5.maxFee());
		
		
	}
	
	
	
}
