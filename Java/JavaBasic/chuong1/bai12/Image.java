package bai12;

public class Image { // hình ảnh
	private int height; // chiều dài 		
	private int width; // chiều rộng 
	private String source; // đường dẫn đến hình ảnh
	private String qualiti; // chất lượng hình ảnh
	// contructor
	public Image(int height, int width, String source, String qualiti) {
		super();
		this.height = height;
		this.width = width;
		this.source = source;
		this.qualiti = qualiti;
	}
	// getter and setter
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getQualiti() {
		return qualiti;
	}
	public void setQualiti(String qualiti) {
		this.qualiti = qualiti;
	}
	
	

}
