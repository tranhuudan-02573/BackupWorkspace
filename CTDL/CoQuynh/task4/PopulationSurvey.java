package task4;

public class PopulationSurvey {
	// ----------------FILL YOUR FULL NAME AND ID--------------------------
	/*
	 * Your full name: Id:
	 */
	//////////////////////////////////////////////////////////////////////
	private String id;
	private String address;
	private int quantityFemale;// so luong nu
	private int quantityMale;// so luong nam

	/*
	 * QUESTION 3: 1 POINT Write constructor has input paramaters id, address,
	 * quantityFemale, quantityMale 0.25 point write get(), set() for each attribute
	 * (0.25 point) write toString() (0.25 point) test with your id student, your
	 * address, your female and male in your family (0.25 point)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopulationSurvey p = new PopulationSurvey("dsa", "dsads", 10, 10);
		System.out.println(p.toString());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getQuantityFemale() {
		return quantityFemale;
	}

	public void setQuantityFemale(int quantityFemale) {
		this.quantityFemale = quantityFemale;
	}

	public int getQuantityMale() {
		return quantityMale;
	}

	public void setQuantityMale(int quantityMale) {
		this.quantityMale = quantityMale;
	}

	public PopulationSurvey(String id, String address, int quantityFemale, int quantityMale) {
		super();
		this.id = id;
		this.address = address;
		this.quantityFemale = quantityFemale;
		this.quantityMale = quantityMale;
	}

	@Override
	public String toString() {
		return this.id + " " + this.address + " " + this.quantityFemale + " " + this.quantityMale;
	}

}
