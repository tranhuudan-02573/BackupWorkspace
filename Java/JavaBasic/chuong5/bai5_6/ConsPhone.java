package bai5_6;

public class ConsPhone implements IPhone {
	private PhoneNumber first;
	private IPhone rest;

	public ConsPhone(PhoneNumber first, IPhone rest) {
		this.first = first;
		this.rest = rest;
	}

	public String whoseNumber(String thatNumber) {
		return this.first.sameNumber(thatNumber) ? this.first.getName() + "\n" + this.rest.whoseNumber(thatNumber)
				: this.rest.whoseNumber(thatNumber);
	}

	public String phoneNumber(String thatName) {
		return this.first.sameName(thatName) ? this.first.getNumber() + "\n" + this.rest.phoneNumber(thatName)
				: this.rest.phoneNumber(thatName);
	}
}
