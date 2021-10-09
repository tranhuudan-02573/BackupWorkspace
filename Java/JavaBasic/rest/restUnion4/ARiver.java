package restUnion4;

public abstract class ARiver {
	protected Location loccation;
	protected double length;
	public ARiver(Location loccation, double length) {
		super();
		this.loccation = loccation;
		this.length = length;
	}
	public String toString() {
		return this.loccation.toString() + ", length: " + this.length; 
			
	}
	

}
