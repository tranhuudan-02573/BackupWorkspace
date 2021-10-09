package baiTapTuLuyen;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		// Input
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap so giay :");
		int totalSecond = s.nextInt();
		// Process
		int hour = totalSecond / 3600;
		
		int minute = (totalSecond % 3600 ) / 60;
		int second = totalSecond % 60;
		// Output
		System.out.println(hour + ":" + minute + ":" + second);
	}

}
