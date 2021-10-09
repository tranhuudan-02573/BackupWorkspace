package cau3_OOP;

import java.util.ArrayList;

import cau4_Swing.Date;

public class TestBank {
	private ArrayList<Account> accounts = new ArrayList<Account>();

	public TestBank() {
		createAccount();
	}

	public void createAccount() {
		accounts.add(new CheckingAccount("Earl Gray", 1729, 1250, 500));
		accounts.add(new CertificateOfDeposite("Ima Flatt", 4104, 10123, 4, new Date(1, 6, 2010)));
		accounts.add(new SavingAccount("Annie Proulx", 2992, 800, 3.5));

		accounts.add(new CheckingAccount("Earl Gray2", 1729, 1250, 500));
		accounts.add(new CertificateOfDeposite("Ima Flatt2", 4104, 10123, 4, new Date(1, 6, 2010)));
		accounts.add(new SavingAccount("Annie Proulx2", 2992, 800, 3.5));

		accounts.add(new CheckingAccount("Earl Gray3", 1729, 1250, 500));
		accounts.add(new CertificateOfDeposite("Ima Flatt3", 4104, 10123, 4, new Date(1, 6, 2010)));
		accounts.add(new SavingAccount("Annie Proulx3", 2992, 800, 3.5));

		accounts.add(new SavingAccount("Annie Proulx4", 2992, 800, 3.5));
	}

	public void printList() {
		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	public static void main(String[] args) {
		TestBank bank = new TestBank();
		bank.printList();
	}
}
