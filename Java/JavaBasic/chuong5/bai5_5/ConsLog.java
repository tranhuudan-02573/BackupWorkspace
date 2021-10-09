package bai5_5;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;

	// contructor
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	// getter and setter
	public Entry getFirst() {
		return first;
	}

	public void setFirst(Entry first) {
		this.first = first;
	}

	public ILog getRest() {
		return rest;
	}

	public void setRest(ILog rest) {
		this.rest = rest;
	}

	@Override
	public double miles(int month, int year) {
		if (this.first.sameMonthInAyear(month, year))
			return getDistance() + this.rest.miles(month, year);
		else
			return this.rest.miles(month, year);
	}

	public double maxDistance() {
		return Math.max(this.first.getDistance(), this.rest.maxDistance());
	}

	public double getDistance() {
		return this.first.getDistance();
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof ConsLog)) {
			return false;
		} else {
			ConsLog tmp = (ConsLog) o;
			if (this.first.equals(tmp.first) && this.rest.equals(tmp.rest)) {
				return true;
			} else
				return false;
		}
	}

}
