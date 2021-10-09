package bai42;

public class Sounds extends AGallery {// âm nhạc
	private PlayingTime time;// thời gian phát
	// contructor
	public Sounds(String nameSourceFile, double sizes, PlayingTime time) {
		super(nameSourceFile, sizes);
		this.time = time;
	}
	// getter and setter
	public PlayingTime getTime() {
		return time;
	}
	public void setTime(PlayingTime time) {
		this.time = time;
	}
	
	

}
