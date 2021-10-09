package task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileUtils {
	// read the content of a text file
	public static void readText(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line = null;
		while (true) {
			line = reader.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
		reader.close();
	}

	// write the text to the fileName
	public static void writeText(String fileName) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(fileName);
		writer.println("Dai hoc Nong Lam Tp.HCM");
		writer.println("Khoa Cong nghe Thong tin");
		writer.println("Thuc hanh CTDL DH18DT");
		writer.close();
	}

	public static void main(String[] args) {
		try {
			TextFileUtils.readText("./ThayDu/Test.txt");
			TextFileUtils.writeText("./ThayDu/Test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
