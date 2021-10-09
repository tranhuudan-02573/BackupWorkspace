package restUnion2;

public class Entry {
	private Date date;
	private double distance;
	private int duration;
	private String comment;
	public Entry(Date date, double distance, int duration, String comment) {
		super();
		this.date = date;
		this.distance = distance;
		this.duration = duration;
		this.comment = comment;
	}
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
	public String toString() {
		return "date: "+this.date + "\tdistance: " + this.distance + "\tduration: " + this.duration + "\tcomment: " + this.comment;
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Entry))
			return false;
		else {
			Entry that = (Entry) obj;
			return this.date.equals(that.date) && this.distance == (that.distance) && this.duration == (that.duration) && this.comment.equals(that.comment);
		}
	}
}
