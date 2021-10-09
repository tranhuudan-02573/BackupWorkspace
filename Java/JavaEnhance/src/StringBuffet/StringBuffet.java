package StringBuffet;

public class StringBuffet {
	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer(15);
		buff.append("This is ");
		buff.append("String");
		buff.insert(7, " a");
		buff.append('.');
		System.out.println(buff.length()); // 17
		// dung luong
		System.out.println(buff.capacity()); // 32
		String output = buff.toString();
		System.out.println(output); // "This is a String."
	}

}
