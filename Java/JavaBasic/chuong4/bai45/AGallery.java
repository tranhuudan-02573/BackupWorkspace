package bai45;

public abstract class AGallery implements IGallery {// thư viện
	protected String nameSourceFile;// đường dẫn 
	protected double sizes;// kích thước
	// contructor
	public AGallery(String nameSourceFile, double sizes) {
		super();
		this.nameSourceFile = nameSourceFile;
		this.sizes = sizes;
	}
	//tính thời gian tải về
	public double timeToDownload(double networkSpeed) {
		return this.sizes/networkSpeed;
	}
	// kiểm tra tệp có nhỏ hơn kích thước tối đa yêu cầu không 
	public boolean smallerThan(int maximumSize) {
		return this.sizes < maximumSize;
	}
	// kiểm tra tên tệp này có giống tên tệp kia không 
	public boolean sameName(String givenName) {
		return this.nameSourceFile.equals(givenName);
	}

	
	

}
