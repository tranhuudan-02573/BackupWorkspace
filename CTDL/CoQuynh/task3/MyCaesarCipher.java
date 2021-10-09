package task3;

public class MyCaesarCipher {
	public static final char[] ALPHABET = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
			'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ' };
	private int n;

	public MyCaesarCipher(int shiftSteps) {
		this.n = shiftSteps;
	}

	public char encryptChar(char c) {
		// TODO
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b += i;

			}
		}
		int a = (b + this.n) % 26;
		if (b == 26)
			a = 26;
		return ALPHABET[a];
	}

	public String encrypt(String input) {
		// TODO
		char[] ch = input.toCharArray();
		StringBuffer st = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			st.append(encryptChar(ch[i]));
		}

		return st.toString();
	}

	public char decryptChar(char c) {
		// TODO
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b += i;

			}
		}

		int e = ((b - this.n) + 26) % 26;
		if (b == 26)
			e = 26;
		return ALPHABET[e];
	}

	public String decrypt(String input) {
		// TODO
		char[] ch = input.toCharArray();
		StringBuffer st = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			st.append(decryptChar(ch[i]));
		}

		return st.toString();
	}

	public static void main(String[] args) {
		MyCaesar s = new MyCaesar(19);
		System.out.println(s.encryptChar('T'));
		System.out.println(s.encrypt("ANH YEU EM"));
		System.out.println(s.decryptChar('M'));
		System.out.println(s.decrypt("TGA RXN XF"));
	}
}