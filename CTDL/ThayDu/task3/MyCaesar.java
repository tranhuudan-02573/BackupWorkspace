package task3;

public class MyCaesar {
	public static final char[] ALPHABET = { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private int n;// shift steps (right shift)

	public MyCaesar(int shiftSteps) {
		this.n = shiftSteps;
	}

	// Encrypt a character according to the given shif steps.
	// Encrypt: En(x) = (x + n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char encryptChar(char c) {
		// TODO
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b += i;

			}
		}
		int a = (b + this.n) % 26;
		if (b == 0)
			a = 0;
		return ALPHABET[a];
	}

	// Encrypt a text using the above function for encrypting a charater.
	public String encrypt(String input) {
		// TODO
		char[] ch = input.toCharArray();
		StringBuffer st = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			st.append(encryptChar(ch[i]));
		}

		return st.toString();
	}

	// Decrypt a character according to the given shif steps.
	// Decrypt: Dn(x) = (x – n) mod 26. x represents the index of c in the ALPHABET
	// array
	public char decryptChar(char c) {
		// TODO
		int b = 0;
		for (int i = 0; i < ALPHABET.length; i++) {
			if ((ALPHABET[i] + "").equals((c + "").toUpperCase())) {
				b += i;

			}
		}

		int e = ((b - 19) + 26) % 26;
		if (b == 0)
			e = 0;
		return ALPHABET[e];
	}

	// Decrypt a encrypted text using the above function for decrypting a charater.
	public String decrypt(String input) {
		// TODO
		char[] ch = input.toCharArray();
		StringBuffer st = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			st.append(decryptChar(ch[i]));
		}

		return st.toString();
	}

	// Encrypt a encrypted the text content in the srcfile and save it into desFile.
	public void encrypt(String srcFile, String desFile) {
		// TODO
	}

	// Decrypt a encrypted the text content in the srcfile and save it into desFile.
	public void decrypt(String srcFile, String desFile) {
		// TODO
	}

	public static void main(String[] args) {
		MyCaesarCipher s = new MyCaesarCipher(19);
		System.out.println("encryptChar: " + s.encryptChar('a'));
		System.out.println("dencryptChar: " + s.decryptChar('t'));
		System.out.println("encryptString: " + s.encrypt("C T D L"));
		System.out.println("dencryptString: " + s.decrypt("V M W E"));
	}
}