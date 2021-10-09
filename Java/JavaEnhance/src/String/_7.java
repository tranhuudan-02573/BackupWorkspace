package String;

public class _7 {
	public static void main(String[] args) {

		String input = "test 1-2-3";
		int output = 0;
		for (int index = 0; index < input.length(); index++) {
			char c = input.charAt(index);
			if (Character.isDigit(c))

				output = output * 10 + Character.digit(c, 10);

			System.out.println(output);
		}
		System.out.println(output); // 123

	}

}
