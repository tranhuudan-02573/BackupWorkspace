package OOP2;

public class File {
	private String fileName;
	private double size;
	private Duration duration;

	// constructor
	public File(String fileName, double size, Duration duration) {
		super();
		this.fileName = fileName;
		this.size = size;
		this.duration = duration;
	}

	// getter and setter
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "[fileName=" + fileName + ", size=" + size + this.duration.toString() + "]";
	}

	// equals
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof File) {
			File that = (File) obj;
			return this.fileName.equals(that.fileName) && this.size == that.size && this.duration.equals(that.duration);
		} else {
			return false;
		}
	}

	public boolean shorterThan(File that) {
		return this.duration.shorterThan(that.duration);
	}

}
