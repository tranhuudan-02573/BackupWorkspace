package list1;

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

	// so sánh
	public ILog sortByDistance() {
		return (this.rest.sortByDistance()).insertDistanceOrder(this.first);
	}

	// kiểm tra và in ra danh sách theo khoảng cách
	public ILog insertDistanceOrder(Entry e) {
		if (e.hasDistanceShorterThan(this.first)) {
			return new ConsLog(e, this);
		} else
			return new ConsLog(this.first, this.rest.insertDistanceOrder(e));
	} 



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((rest == null) ? 0 : rest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsLog other = (ConsLog) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (rest == null) {
			if (other.rest != null)
				return false;
		} else if (!rest.equals(other.rest))
			return false;
		return true;
	}

	// so sánh
	public ILog sortBySpeed() {
		return (this.rest.sortBySpeed()).insertSpeedOrder(this.first);
	}

	// so sánh và in ra danh sách theo tốc độ
	public ILog insertSpeedOrder(Entry e) {
		if (e.hasSpeedFasterThan(this.first))
			return new ConsLog(e, this);
		else
			return new ConsLog(this.first, this.rest.insertSpeedOrder(e));
	}

	// toString
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}

	// tổng quãng đường
	public double miles() {
		// TODO Auto-generated method stub
		return (this.first.getDistance() + this.rest.miles());
	}

	@Override
	public ILog getLogs(int month, int year) {
		// TODO Auto-generated method stub
		if (this.first.sameMonthInAYear(month, year))
			return new ConsLog(this.first, this.rest.getLogs(month, year));
		else
			return this.rest.getLogs(month, year);
	
	}
}
