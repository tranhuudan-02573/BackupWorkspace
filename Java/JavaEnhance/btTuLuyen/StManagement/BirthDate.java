package StManagement;

public class BirthDate {

	private static int day;
	private static int month;
	private static int year;

	public BirthDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return this.day + "/" + month + "/" + year;
	}

	Comparable<BirthDate> c = new Comparable<BirthDate>() {

		@Override
		public int compareTo(BirthDate other) {
			// TODO Auto-generated method stub
			int diff = BirthDate.year - other.year;
			if (diff != 0)
				return diff;

			diff = BirthDate.month - other.month;
			if (diff != 0)
				return diff;

			diff = BirthDate.day - other.day;
			return diff;
		}
	};

}
