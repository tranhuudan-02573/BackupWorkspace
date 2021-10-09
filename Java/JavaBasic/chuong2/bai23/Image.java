package bai23;

public class Image { // hình ảnh
	private int width; // chiều rộng 
	private int height; // chiều dài
	private String source; // đường dẫn đến hình ảnh
	private String qualiti; // chất lượng hình ảnh
	// contructor
	public Image(int width, int height, String source, String qualiti) {
		this.width = width;
		this.height = height;
		this.source = source;
		this.qualiti = qualiti;
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
	// so sánh chiều dài có lớn hơn chiều rộng của 1 hình ảnh không
	public boolean isPortrait() { 
		return this.height > this.width;
	}
	// tính toán có bao nhiêu pixel trong 1 hình ảnh
	public int size() { 
		return this.height * this.width;
	}
	// so sánh hình ảnh này có nhiều pixel hơn hình ảnh kia không
	public boolean isLarger(Image other) { 
		return this.size() > other.size();
	}
	// so sánh hình ảnh này có giống hình ảnh kia không
	public boolean same(Image other) { 
		return this.size() == other.size() && this.qualiti == other.qualiti&&this.source==other.source;
	}
	// kiểm tra xem kích thước hình ảnh đó to, nhỏ hay trung bình
	public String sizeString() { 
		if (this.size() <= 10000) {
			return "small";
		}
		if (this.size() > 10001 && this.size() < 1000000) {
			return "medium";
		}
		return "large";
	}
	
	
}
