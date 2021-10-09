package baiTapTuLuyen;

public class FormatCalendar {
	public static String format(String str) {
		final String[] MONTH_STRING = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		int index1 = str.indexOf("/");
		int index2 = str.indexOf("/", index1 + 1);
		int date = Integer.parseInt(str.substring(0, index1));
		int month = Integer.parseInt(str.substring(index1 + 1, index2));
		int year = Integer.parseInt(str.substring(index2 + 1, str.length()));

		return date + " " + MONTH_STRING[month] + " " + year;
	}

	public static void main(String[] args) {
		System.out.println(format("12/02/2004"));
	}
}
