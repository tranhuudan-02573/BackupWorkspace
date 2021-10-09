package OOP2;

public class Duration {
	private int minute;
	private int second;

	// constructor
	public Duration(int minute, int second) {
		super();
		this.minute = minute;
		this.second = second;
	}

	// getter and setter
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "[minute=" + minute + ", second=" + second + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Duration other = (Duration) obj;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	public int change() {
		return this.minute * 60 + this.second;

	}

	public boolean shorterThan(Duration that) {
		return this.change() < that.change();

	}
}
