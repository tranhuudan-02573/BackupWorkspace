package Code;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		StringBuffer[] sb = new StringBuffer[numRows];
		String st = "";
		int sblen = sb.length;
		for (int i = 0; i < sblen; i++) {
			sb[i] = new StringBuffer();
		}
		int slen = s.length();
		int index = 0;
		while (index < slen) {
			for (int j = 0; j < numRows && index < slen; j++) {
				sb[j].append(" " + s.charAt(index++) + " ");
			}
			for (int j = numRows - 2; j > 0 && index < slen; j--) {
				sb[j].append(s.charAt(index++) + " ");
//				System.out.println(sb[j]);
			}

		}

//		sb[0].append(sb[0]);
		for (int i = 0; i < numRows; i++) {
			st += sb[i] + "\n";
		}
		return st;

	}

	public static void main(String[] args) {
		ZigZagConversion zz = new ZigZagConversion();
		System.out.print(zz.convert("PAYPALISHIRING", 3));

	}
}
