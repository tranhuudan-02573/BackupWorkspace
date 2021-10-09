package baiTapTuLuyen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptedString {
	public String encrypt(String s) {
		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			Matcher m = p.matcher(c + "");
			boolean b = m.find();
			if (b == true)
				c = s.charAt(i);
			else
				c = (char) (c - 2);
			str += c;
		}

		return str;

	}

	public static void main(String[] args) {
		System.out.println(new EncryptedString().encrypt("DSda13!"));
	}
}
