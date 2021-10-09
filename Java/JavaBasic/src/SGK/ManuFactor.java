package SGK;

public class ManuFactor {// hãng sản xuất
	private String companyName;// tên công ty
	private String country;// quốc gia 
	// contructor
	public ManuFactor(String companyName, String country) {
		super();
		this.companyName = companyName;
		this.country = country;
	}
	// getter and setter
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	// kiểm tra xem 2 công ty có tên giống nhau không
	public boolean same(ManuFactor that) {
		return this.companyName.equals(that.companyName);
	}

}
