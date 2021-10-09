package String;

public class _8 {
	public static void main(String[] args) {
		String name = "Joe";
		if ("Joe".equals(name))
			name += " Smith";
		System.out.println(name);

		boolean same = "Joe".equalsIgnoreCase("joe");
		System.out.println(same);

		boolean a1 = Character.isLetter('*');
		System.out.println(a1);
		boolean a2 = Character.isLetter('a');
		System.out.println(a2);

		boolean a3 = Character.isDigit('3');
		System.out.println(a3);
		boolean a4 = Character.isDigit('d');
		System.out.println(a4);

		boolean a5 = Character.isWhitespace(' ');
		System.out.println(a5);
		boolean a6 = Character.isWhitespace('d');
		System.out.println(a6);

		boolean a7 = Character.isUpperCase('D');
		System.out.println(a7);

		String name1 = "Joe Smith";
		System.out.println(name1.toLowerCase()); // "joe smith"

		System.out.println(name1.toUpperCase()); // "JOE SMITH"
		System.out.println(" Joe Smith ".trim()); // "Joe Smith"
		System.out.println("Joe Smith".indexOf('e')); // 2
		System.out.println("Joe Smith".length()); // 9
		System.out.println("Joe Smith".charAt(5)); // 'm'
		System.out.println("Joe Smith".substring(5)); // "mith"
		System.out.println("Joe Smith".substring(2, 5)); // "e S"

	}
}
