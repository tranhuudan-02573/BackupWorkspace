package bai5_11;

public class ConsListMail implements IListMail {
	private Mail first;
	private IListMail rest;

	// constructor
	public ConsListMail(Mail first, IListMail rest) {
		this.first = first;
		this.rest = rest;
	}

	public IListMail sort() {
		return this.rest.sort().insert(this.first);
	}

	public IListMail insert(Mail that) {
		return this.first.compareDate(that) ? new ConsListMail(this.first, this.rest.insert(that))
				: new ConsListMail(that, this.rest.insert(this.first));
	}

	// getter and setter
	public String getDate() {
		return this.first.getDate() + " " + this.rest.getDate();
	}

	public Mail getFirst() {
		return first;
	}

	public void setFirst(Mail first) {
		this.first = first;
	}

	public IListMail getRest() {
		return rest;
	}

	public void setRest(IListMail rest) {
		this.rest = rest;
	}

}
