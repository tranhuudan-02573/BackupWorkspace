package list1;


public class MTLog implements ILog {
	//
	public ILog sortByDistance() {
		return new MTLog();
	}
	// in ra danh sách chứa empty theo khoảng cách
	public ILog insertDistanceOrder(Entry e) {
		return new ConsLog(e, new MTLog());
	}
	// equals
	public boolean equals(Object o){
		if(o == null || !(o instanceof MTLog))
			return false;
		return true;
	}
	// so sánh
	public ILog sortBySpeed() {
		return new MTLog();
	}
	// in ra danh sách chứa empty theo tốc độ
	public ILog insertSpeedOrder(Entry e) {
		return new ConsLog(e, new MTLog());
	}
	// toString
	public String toString(){
		return "";
	}
	// tổng quãng đường 
	@Override
	public double miles() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	@Override
	public ILog getLogs(int month, int year) {
		// TODO Auto-generated method stub
		return new MTLog();
	}

}
