package logic;

import java.io.File;

public class Square {
	private boolean isDroped;
	private File value;

	public Square() {
		isDroped = true;
	}

	public boolean isDroped() {
		return isDroped;
	}

	public void setDroped(boolean isDroped) {
		this.isDroped = isDroped;
	}

	public File getValue() {
		return value;
	}

	public void setValue(File value) {
		this.value = value;
	}
}
