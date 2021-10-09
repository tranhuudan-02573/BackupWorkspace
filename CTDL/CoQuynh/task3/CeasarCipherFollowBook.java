package task3;

/**
 * Code from Book
 */
/** Class for doing encryption and decryption using the Caesar Cipher. */
public class CeasarCipherFollowBook {
	protected char[] encoder = new char[26]; // Encryption array
	protected char[] decoder = new char[26]; // Decryption array

	/** Constructor that initializes the encryption and decryption arrays */
// Index in Alph | 0 | 1 | 2 | 3 |4 | 5 | 6 | 7 | 8 | 9 | 10| 11| 12| 13| 14| 15| 16| 17| 18| 19| 20| 21| 22| 23| 24| 25|
// Alphabet      | A | B | C | D |E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z |
// Index in Com  |65 | 66| 67| 68|69| 70| 71| 72| 73| 74| 75| 76| 77| 78| 79| 80| 81| 82| 83| 84| 85| 86| 87| 88| 89| 90|
	public CeasarCipherFollowBook(int k) { // k = moving step
		for (int p = 0; p < 26; p++) {
			// init encoder DEFGHIJKLMNOPQRSTUVWXYZABC
			encoder[p] = (char) ('A' + (p + k) % 26);
			// init decoder XYZABCDEFGHIJKLMNOPQRSTUVW
			decoder[p] = (char) ('A' + (p - k + 26) % 26);
		}
	}

	/** Returns String representing encrypted message. */
	public String encrypt(String message) {
		return transform(message, encoder); // use encoder array
	}

	/** Returns decrypted message given encrypted secret. */
	public String decrypt(String secret) {
		return transform(secret, decoder); // use decoder array
	}

	/** Returns transformation of original String using given code. */
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray(); // convert string to char Array
		for (int k = 0; k < msg.length; k++)
			if (Character.isUpperCase(msg[k])) { // we have a letter to change
				int j = msg[k] - 'A'; // will be value from 0 to 25
				msg[k] = code[j]; // replace the character
			}
		return new String(msg);
	}

	/** Simple main method for testing the Caesar cipher */
	public static void main(String[] args) {
//EXPLAIN/---------------------------------------------------------------
		int indexOfA = 'A';
		System.out.println(indexOfA); // index of A in ASCII code is 65
		int indexOfZ = 'Z';
		System.out.println(indexOfZ); // index of A in ASCII code is 90
		int indexOfAs = 'a';
		System.out.println(indexOfAs); // index of A in ASCII code is 90

//TEST//-----------------------------------------------------------------	
		CeasarCipherFollowBook cipher = new CeasarCipherFollowBook(3);
		System.out.println("Encryption code = " + new String(cipher.encoder));
		System.out.println("Decryption code = " + new String(cipher.decoder));
		String message = "THr EAGLE IS IN PLAY; MEET AT JOE'S.THr EAGLE IS IN PLAY; MEET AT JOE'S.THr EAGLE IS IN PLAY; MEET AT JOE'S.";

		String coded = cipher.encrypt(message);
		System.out.println("Secret: " + coded);
		String answer = cipher.decrypt(coded);
		System.out.println("Message: " + answer); // should be plaintext again
	}
}
