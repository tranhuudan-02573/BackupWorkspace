package thuatToanTimKiem;

public class BinarySearchMain {
	public static int binarySearchRecursive(int a[], int l, int r, int x) {
		// RECURSIVE IMPLEMENTATION OF BINARY SEARCH
		int mid = (l + r) / 2;
		// base case 1 = checks if array is empty or not
		if (r - l < 0) {
			return -1;
		}
		// base case 2 = checks if array middle is the target value
		if (x == a[mid]) {
			return mid;
		}
		// recursive case 1 = removes left array
		else if (x >= a[mid]) {
			return binarySearchRecursive(a, mid + 1, r, x);
		}
		// recursive case 2 = removes right array
		else {
			return binarySearchRecursive(a, l, mid - 1, x);
		}
	}
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 10, 40 }; 
	    int x = 10; 
	    int l = a.length-1;
	    int result = binarySearchRecursive(a,0,l,x);
	    System.out.println(result);
	    
	}
}
