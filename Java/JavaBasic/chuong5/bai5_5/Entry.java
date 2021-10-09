package bai5_5;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	// constructor

	public Entry(Date date, double distance, int duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}

	// getter and setter
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean hasDistanceShorterThan(Entry first) {
		return this.distance < first.distance;
	}

	// equals
	public boolean equals(Object o) {
		if (o == null || !(o instanceof Entry)) {
			return false;
		} else {
			Entry tmp = (Entry) o;
			if (this.date.equals(tmp.date) && this.distance == tmp.distance && this.duration == tmp.duration
					&& this.comment.equals(tmp.comment)) {
				return true;
			} else
				return false;
		}
	}

	public boolean sameMonthInAyear(int month, int year) {
		return this.date.sameMonthInAyear(month, year);
	}
}
