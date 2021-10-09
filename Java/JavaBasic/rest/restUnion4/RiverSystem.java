package restUnion4;

public class RiverSystem {
	private Mouth mouth;
	private ARiver river;
	public RiverSystem(Mouth mouth, ARiver river) {
		super();
		this.mouth = mouth;
		this.river = river;
	}
	public Mouth getMouth() {
		return mouth;
	}
	public void setMouth(Mouth mouth) {
		this.mouth = mouth;
	}
	public ARiver getRiver() {
		return river;
	}
	public void setRiver(ARiver river) {
		this.river = river;
	}

}
