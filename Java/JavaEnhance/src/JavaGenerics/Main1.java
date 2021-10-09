package JavaGenerics;

public class Main1 {

	public static void main(String args[]) {
			  
		      Integer[] intArray = {1, 2, 3, 4, 5};
		      Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		      Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		      String[] stringArray = {"B","Y","E"};
		      
		      System.out.print("Integer Array: ");
		      displayArray(intArray);
		      System.out.println(firstIndex(intArray));

		      System.out.print("Double Array: ");
		      displayArray(doubleArray);
		      System.out.println(firstIndex(doubleArray));

		      System.out.print("Character Array: ");
		      displayArray(charArray);
		      System.out.println(firstIndex(charArray));
		      
		      System.out.print("String Array: ");
		      displayArray(stringArray);
		      System.out.println(firstIndex(charArray));
		      
		   }

	// Generic method
	public static <Thing> void displayArray(Thing[] array) {

		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	// Generic method with generic return type
	public static <Thing> Thing firstIndex(Thing[] array) {

		return array[0];
	}
}
