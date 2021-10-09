package baiTapTuLuyen;

public class MaHoa {
	static String MaHoa(String pw) {
		String s = "";
		byte[] spw = new byte[pw.length()];
		byte[] data = pw.getBytes();
		for (int i = 0; i < pw.length(); i++) {
			spw[i] = data[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		String s = "tran huu dan";
//		String s2 = new String(data);
	}
}
