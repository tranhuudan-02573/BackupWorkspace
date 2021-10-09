package bai43;

public abstract class AVehicle implements IVehicle {// các đội xe
	protected String color;// màu sắc xe
	protected int chair;// số ghế 
	// contructor
	public AVehicle(String color, int chair) {
		super();
		this.color = color;
		this.chair = chair;
	}
	
}
