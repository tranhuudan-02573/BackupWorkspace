package bai45;

public class Images extends AGallery{// hình ảnh 
	private int width;// chiều dài 
	private int height;// chiều rộng 
	private String quality;// chất lượng hình ảnh 
	// contructor
	public Images(String nameSourceFile, double sizes, int width, int height, String quality) {
		super(nameSourceFile, sizes);
		this.width = width;
		this.height = height;
		this.quality = quality;
	}
	// getter and setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}

	
	
}
