package list1;

public class Entry {
	private Date date;// ngày 
	private double distance;// khoảng cách
	private int duration;// thời gian
	private String comment;// đánh giá
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
	// so sánh 2 khoảng cách
	public boolean hasDistanceShorterThan(Entry first) {
		return this.distance<first.distance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + duration;
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
		Entry other = (Entry) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (duration != other.duration)
			return false;
		return true;
	}
	//	tốc độ
	public double speed(){
		if(this.duration==0)
			return 0;
		else
				return (this.distance/this.duration);
	}
	public boolean hasSpeedFasterThan(Entry that){
		return this.speed()>that.speed();
	}
	// toString
	public String toString(){
		return "Date: "+ this.date + "\t" 
				+ "Distance: "+ this.distance + "\t"
				+ "Duration: "+ this.duration + "\t"
				+ "Speed: "  + this.speed() + "\t"
				+ "Comment: " + this.comment + "\n";
	}
	public boolean sameMonthInAYear(int month, int year) {
		// TODO Auto-generated method stub
		return this.date.sameMonthInAYear( month, year);
	}
}
