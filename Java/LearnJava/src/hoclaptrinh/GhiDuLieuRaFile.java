package hoclaptrinh;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiDuLieuRaFile {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter prinWriter = new PrintWriter("KQ.DAN.txt", "UTF-8");
		prinWriter.println("Hello JavaCore!");
		prinWriter.close();// luon dong file khi ket thuc chuong trinh
		
	}
}
