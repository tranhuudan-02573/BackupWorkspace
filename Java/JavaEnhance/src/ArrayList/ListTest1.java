package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest1 {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(100);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		Collections.sort(myNumbers);
		for (int i : myNumbers) {
			System.out.println(i);
		}
	}
}
