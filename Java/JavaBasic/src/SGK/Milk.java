package SGK;

public class Milk {// sữa
	private String name;// tên
	private double weight;// trọng lượng
	private double price;// giá bán
	private Date productionDate;// ngày sản xuất
	private Date expiredDate;// ngày hết hạn
	private ManuFactor manuFactor;// hãng sản xuất 
	private Specification specification;// hình dáng của hộp
	// contructor
	public Milk(String name, double weight, double price, Date productionDate, Date expiredDate, ManuFactor manuFactor,
			Specification specification) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.productionDate = productionDate;
		this.expiredDate = expiredDate;
		this.manuFactor = manuFactor;
		this.specification = specification;
	}
	// getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	public Date getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}
	public ManuFactor getManuFactor() {
		return manuFactor;
	}
	public void setManuFactor(ManuFactor manuFactor) {
		this.manuFactor = manuFactor;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
	}
	// kiểm tra 2 hộp sữa được sản xuất cùng hãng hay không
	public boolean sameCompany(Milk that) {
		return this.manuFactor.same(that.manuFactor);
	}
	// tính thể tích hộp sữa
	public double volumn() {
		return this.specification.volumn();
	}
	// kiểm tra xem thể tích của hộp sữa này có lớn hơn thể tích của hộp sữa kia không
	public boolean greaterThan(Milk that) {
		return this.volumn() > that.volumn() ;
	}
	// kiểm tra ngày sản xuất của 1 hộp sữa có nhỏ hơn 1 ngày xác định không
	public boolean after(Milk that) {
		return this.productionDate.after(that.productionDate);
	}
	// kiểm tra ngày hết hạn 
	public boolean isExpired() {
		return this.expiredDate.isExpired();		
	}
	// tính tiền sau khi chiết khấu 
	public double discount() {
		if (this.productionDate.compare())
			return this.price * 0.7;
		if (this.productionDate.comparee())
			return this.price * 0.9;
		if (this.productionDate.compareee())
			return this.price;
		return price;
	}
	
	

	
	
}
