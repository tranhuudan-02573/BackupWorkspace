package WorkingWithFile;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class nenString {
	public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {

		String input = "i love you!! i love you!!i love you!!i love you!!i love you!!i love you!!i love you!!i love you!!";
		byte[] inputObj = input.getBytes("UTF-8");
		System.out.println("length: " + inputObj.length);
		byte[] output = new byte[100];
		Deflater deflater = new Deflater();
		deflater.setInput(inputObj);
		deflater.finish();
		int compressDataLength = deflater.deflate(output);
		System.out.println(compressDataLength);
		// giai nen
		Inflater inflater = new Inflater();
		inflater.setInput(output, 0, output.length);
		byte[] resultObj = new byte[1024];
		int resultLength = inflater.inflate(resultObj);
		inflater.end();
		String output2 = new String(resultObj, 0, resultLength);
		System.out.println(output2);
	}
}
