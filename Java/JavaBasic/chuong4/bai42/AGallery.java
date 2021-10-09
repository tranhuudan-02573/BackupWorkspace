package bai42;

public abstract class AGallery implements IGallery {// thư viện
	protected String nameSourceFile;// đường dẫn  
	protected double sizes; // kích thước 
	// contructor
	public AGallery(String nameSourceFile, double sizes) {
		super();
		this.nameSourceFile = nameSourceFile;
		this.sizes = sizes;
	}
	
	

}
