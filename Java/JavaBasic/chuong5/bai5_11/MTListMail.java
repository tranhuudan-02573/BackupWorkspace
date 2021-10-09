package bai5_11;

public class MTListMail implements IListMail {

	public IListMail sort() {
		return new MTListMail();
	}

	public IListMail insert(Mail that) {
		return new ConsListMail(that, this.sort());
	}

	public String getDate() {
		return "";
	}
}
