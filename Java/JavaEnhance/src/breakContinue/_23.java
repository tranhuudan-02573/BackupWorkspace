package breakContinue;

public class _23 {
	public static void main(String[] args) {
		StringBuffer searchMe = new StringBuffer("peter piper picked a peck of pickled peppers");
		int max = searchMe.length();
		int numPs = 0;
		System.out.println(searchMe);
		for (int i = 0; i < max; i++) {
			// interested only in p's
			if (searchMe.charAt(i) != 'p')
				continue;

			// process p's
			numPs++;
			searchMe.setCharAt(i, 'A');
		}
		System.out.println("Found " + numPs + " p's in the string.");
		System.out.println(searchMe);
	}
}
