package WorkingWithFile;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		File file = new File("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");
		if (file.isFile()) {
//			file.delete();
			System.out.println("file: " + file.getAbsolutePath());
		} else {
			System.out.println("not found");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// read/write text/binary
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");
			fileOutputStream = new FileOutputStream("D:\\WorkSpace\\Java\\hoclaptrinh\\test_cp.txt");
			int ch;
			while ((ch = fileInputStream.read()) != -1) {
				fileOutputStream.write((ch));
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		// fileReader dung de doc text
		// fileWriter dung doc text va doc va ghi ca string
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			// filereder // fileWritter
			fileReader = new FileReader("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");
			fileWriter = new FileWriter("D:\\WorkSpace\\Java\\hoclaptrinh\\test_writer.txt");
			int ch1 = 0;
			while ((fileReader.read()) != -1) {
				System.out.println((char) ch1);
				fileWriter.write(ch1);
			}
			fileWriter.write("hello world");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		// BufferedInputStream doc theo 1 nhom byte ki tu
		BufferedInputStream bufferedInputStream = null;
		try {
			fileInputStream = new FileInputStream("D:\\WorkSpace\\Java\\hoclaptrinh\\test.txt");
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			byte[] data = new byte[1024*10];
			int length = bufferedInputStream.read(data);
			System.out.println("length: " + length);
			String result = new String(data, 0, length);
			System.out.println(result);
		} catch (Exception e) {

		} finally {
			if (bufferedInputStream != null) {
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
