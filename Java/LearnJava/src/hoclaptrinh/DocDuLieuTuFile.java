package hoclaptrinh;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class DocDuLieuTuFile {
	public static void main(String[] args) throws IOException  {
//		Scanner scanner = new Scanner(System.in);
//		int inputInteger = scanner.nextInt();// đọc dữ liệu từ bàn phím
		Scanner scanner = new Scanner(Paths.get("D:\\LTCB2020\\chuong4\\bai41\\ABankAccount"), "UTF-8");// open file to read 
		int inputInteger = scanner.nextInt();// doc du lieu tu inputJava.txt
		while(scanner.hasNextLine()) {
			inputInteger = scanner.nextInt();
			System.out.println("value: " + inputInteger);
		}
		scanner.nextLine();// doc bo dong thua
		String lineData = scanner.nextLine();
		System.out.println("second line data: " + lineData);
		scanner.close();// dong file
	}
	

	
}
