package exercises1;

public class MyArray {
	private double[] array;
	public static final double MAXVALE = Double.POSITIVE_INFINITY;
	private int capacity;

	public MyArray(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.array = new double[capacity];

		for (int i = 0; i < array.length; i++) {
			this.array[i] = MAXVALE;
		}
	}

	public void add(int element) {
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] == MAXVALE) {
				this.array[i] = element;
				break;
			}
		}

	}

	public void prin() {
		for (int i = 0; i < array.length; i++) {
			double value = this.array[i];
			if (value == MAXVALE) {
				value = 0;
			}
			System.out.print((int) value + "\t");
		}
	}

	public void add(int index, int element) {
		if (index < capacity) {
			boolean isOK = false;
			for (int i = 0; i < array.length; i++) {
				if (this.array[i] == MAXVALE) {
					isOK = true;
					break;
				}
			}
			if (isOK) {
				double[] tmp = new double[capacity];
				for (int i = 0; i < tmp.length; i++) {
					if (i != index) {
						if (i < index)
							tmp[i] = this.array[i];
						else if ((i + 1) < capacity)
							tmp[i + 1] = this.array[i];

					} else
						tmp[i] = element;
				}
				this.setArray(tmp);
			}
		}
	}

	public void setArray(double[] arr) {
		// TODO Auto-generated method stub
		this.array = arr;
	}

	public double[] getArr() {
		return array;
	}

	public void deleteIndex(int index) {
		this.array[index] = MAXVALE;
	}

	public void delete(int element) {
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] == element) {
				this.array[i] = MAXVALE;
			}
		}
	}

	public static void main(String[] args) {
		MyArray arr = new MyArray(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(1, 5);
		arr.add(2, 6);

//		arr.delete(2);
//		arr.deleteIndex(0);
		arr.prin();

	}

}
