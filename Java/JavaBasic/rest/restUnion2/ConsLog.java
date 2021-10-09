package restUnion2;

public class ConsLog implements ILog {
	protected Entry first;
	protected ILog rest;
	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog))
			return false;
		else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
	
}
