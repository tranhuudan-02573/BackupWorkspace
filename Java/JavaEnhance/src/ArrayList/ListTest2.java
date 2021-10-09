package ArrayList;

import java.util.*; // Don't forget this import

public class ListTest2 {
	public static void main(String[] args) {
		List<String> entries = new ArrayList<String>();
		double d;
		while ((d = Math.random()) > 0.1) {
			entries.add("Value: " + d);
		}
		Collections.sort(entries);
		for (String entry : entries) {
			System.out.println(entry);
		}
	}
}
