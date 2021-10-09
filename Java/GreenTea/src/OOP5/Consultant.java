package OOP5;

public class Consultant extends Employee {
	private int contractNumber;
	private int billingDate;

	public Consultant(Name name, HiredDate hiredDate, int contractNumber, int billingDate) {
		super(name, hiredDate);
		this.contractNumber = contractNumber;
		this.billingDate = billingDate;
	}

	@Override
	public double monthlySalary() {
		return this.billingDate;
	}

	public int getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public int getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(int billingDate) {
		this.billingDate = billingDate;
	}

	@Override
	public String toString() {
		return "Consultant [contractNumber=" + contractNumber + ", billingDate=" + billingDate + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultant other = (Consultant) obj;
		if (billingDate != other.billingDate)
			return false;
		if (contractNumber != other.contractNumber)
			return false;
		return true;
	}

}
