package cau1;

public class WordCorrect {

	public static String wordCorrect(String word) {
		char[] ch = word.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				if (ch[i] == ' ')
					sb.append(ch[i]);
				else
					sb.append((ch[i] + "").toUpperCase());
			} else if (ch[i] != ' ') {
				if ((ch[i - 1] == ' ')) {
					sb.append((ch[i] + "").toUpperCase());
				} else
					sb.append((ch[i] + "").toLowerCase());

			} else
				sb.append(ch[i]);
		}
		return sb.toString();

	}
	
	public static void main(String[] args) {
		String word = "nguyen van a";
		System.out.println(word);
		System.out.println(wordCorrect(word));

		String word2 = "nguyen                    van        a          ";
		System.out.println(word2);
		System.out.println(wordCorrect(word2));

		String word3 = "             nguyen                    VANÁDFF      CFDSFDSF     a          ";
		System.out.println(word3);
		System.out.println(wordCorrect(word3));

		String word4 = "     fadsf    432432   nguyen       #%^#@             van        a          ";
		System.out.println(word4);
		System.out.println(wordCorrect(word4));
	}
}
