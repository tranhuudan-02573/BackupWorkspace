package list1;

public interface ILog {
	public double miles();
	public ILog getLogs(int month, int year);
	public ILog sortByDistance();
	public ILog insertDistanceOrder(Entry e);
	public ILog sortBySpeed();
	public ILog insertSpeedOrder(Entry e);
	
}
