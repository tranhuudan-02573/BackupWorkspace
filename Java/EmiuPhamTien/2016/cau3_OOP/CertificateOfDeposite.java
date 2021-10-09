package cau3_OOP;

import cau4_Swing.Date;

public class CertificateOfDeposite extends Account {
	private int interestestRate;
	private Date maturity;

	public CertificateOfDeposite(String name, int id, double currentBalace, int interestestRate, Date maturity) {
		super(id, name, currentBalace);
		this.interestestRate = interestestRate;
		this.maturity = maturity;
	}

	@Override
	public String toString() {
		return name + "\t\t" + id + "\t\t" + currentBalace + "\t\t" + interestestRate + "\t\t" + maturity.toString();
	}

}
