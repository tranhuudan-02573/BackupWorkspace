package cau2_String;

public class Cau1_BoKyTuHoa {
	public static String boKTuHoa(String st) {
		/*
		 * Ý tưởng: Chuyển chuỗi thành mảng ký tự rồi duyệt nếu có ký tự hoa thì KHÔNG
		 * cộng thêm vô chuỗi mới 
		 */
		char[] ch = st.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if (!(ch[i] >= 'A' && ch[i] <= 'Z')) {
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String st = "HhAaXApSDpFy";
		if (st.length() > 10000) {
			System.out.println("Chuỗi s không quá 10000");
		}
		System.out.println(boKTuHoa(st));
	}
}
