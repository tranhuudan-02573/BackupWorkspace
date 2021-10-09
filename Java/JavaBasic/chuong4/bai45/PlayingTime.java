package bai45;

public class PlayingTime {// thời gian chơi nhạc 
	private int minutes;// phút 
	private int seconds;// giây
	// contructor
	public PlayingTime(int minutes, int seconds) {
		super();
		this.minutes = minutes;
		this.seconds = seconds;
	}
	// getter and setter
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	

}
