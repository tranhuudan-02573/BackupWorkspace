package WorkingWithFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		File text = new File("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");

		Scanner scanner = null;
		try {
			scanner = new Scanner(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// đọc file theo dòng
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
		}

//		File file = new File("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");
//		Scanner scanner = new Scanner(file);
//		String[] words = new String[1024];
//		int[] numbers = new int[1024];
//		int i = 0;
//		if (scanner.hasNextLine()) {
//			scanner.nextLine();
//		}
//
//		while (scanner.hasNextInt()) {
//			int num = scanner.nextInt();
//			numbers[i] = num;
//			i++;
//			if (i >= 100) {
//				break;
//			}
//		}
//
//		showNumber(numbers, i);
//	}
//
//	private static void showInfo(String[] words) {
//		for (String word : words) {
//			if (word == null) {
//				break;
//			}
//			System.out.println(word);
//		}
//	}
//
//	private static void showNumber(int[] numbers, int size) {
//		for (int i = 0; i < size; i++) {
//			System.out.println(numbers[i]);
//		}
	}

}
