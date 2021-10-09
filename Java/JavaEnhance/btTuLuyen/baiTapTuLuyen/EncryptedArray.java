package baiTapTuLuyen;

public class EncryptedArray {
	public static String encryptHelper(String text, int colNum) {
		String res = "";
		int rowNum = text.length() / colNum;
		if (text.length() % colNum > 0) {
			rowNum++;
		}
		char[][] matrix = new char[rowNum][colNum];
		for (int i = 0; i < colNum; i++)
			matrix[rowNum - 1][i] = '-';
		for (int i = 0; i < text.length(); i++) {
			matrix[i / colNum][i % colNum] = text.charAt(i);
		}
//		for (int row = 0, index = 0; row < rowNum; row++) {
//			for (int col = 0; col < colNum; col++) {
//				char c = '-';
//				if (index < text.length()) {
//					c = text.charAt(index++);
//				}
//				matrix[row][col] = c;
//			}
//		}
		for (int col = 0; col < colNum; col++) {
			for (int row = 0; row < rowNum; row++) {
				res += matrix[row][col];
			}
		}

		return res;

	}

	public static String dencryptHelper(String text, int colNum) {
		String res = "";
		int rowNum = text.length() / colNum;
		if (text.length() % colNum > 0) {
			rowNum++;
		}
		char[][] matrix = new char[rowNum][colNum];

//		for (int i = 0; i < text.length(); i++) {
//			matrix[i / colNum][i % colNum] = text.charAt(i);
//		}
		for (int col = 0, index = 0; col < colNum; col++) {
			for (int row = 0; row < rowNum; row++) {
				char c = ' ';
				if (index < text.length()) {
					c = text.charAt(index++);
				}
				matrix[row][col] = c;
			}
		}
		for (int col = 0; col < colNum; col++) {
			for (int row = 0; row < rowNum; row++) {
				res += matrix[row][col];
			}
		}

		return res;

	}

	public static void main(String[] args) {
		String s = "the best interface is no interface ";
		System.out.println(encryptHelper(s, 6));
		System.out.println(dencryptHelper(s, 6));
	}

}
