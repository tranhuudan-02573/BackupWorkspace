package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class
		// ex: (name,email),(username,userID),(country,capital)

		HashMap<String, String> countries = new HashMap<String, String>();

		// add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");

		// System.out.println(countries);
		// countries.remove("USA");
		// System.out.println(countries.get("Russia"));
		// countries.clear();
		// System.out.println(countries.size());
		// countries.replace("USA", "Detroit");
		// System.out.print(countries.containsKey("England"));
		// System.out.print(countries.containsValue("Beijing"));

		for (String i : countries.keySet()) {
			System.out.print(i + "\t" + "= ");
			System.out.println(countries.get(i));
		}

	}
}
