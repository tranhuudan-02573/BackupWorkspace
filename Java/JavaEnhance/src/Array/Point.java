package Array;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static Point[] createArray() {
		Point[] p;
		p = new Point[10];
		for (int i = 0; i < 10; i++) {
			p[i] = new Point(i, i + 1);
		}
		return p;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Point[] points = createArray();
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i].toString());
		}
	}

}
