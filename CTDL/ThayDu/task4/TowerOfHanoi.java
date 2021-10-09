package task4;

public class TowerOfHanoi {

	public static void towerOfHanoi(int disk, char source, char dest, char spare) {
		if (disk == 1) {
			System.out.println("Move disk 1 from source " + source + " to dest " + dest);
			return;
		}
		towerOfHanoi(disk - 1, source, spare, dest);
		System.out.println("Move disk " + disk + " from source " + source + " to dest " + dest);
		towerOfHanoi(disk - 1, spare, dest, source);
	}

	public static void main(String args[]) {
		towerOfHanoi(3, 'A', 'C', 'B');
	}
}
