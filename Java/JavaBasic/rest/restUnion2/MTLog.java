package restUnion2;

public class MTLog implements ILog {
	public String toString() {
		return "";
	}
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLog))
			return false;
		return true;
	}
}
