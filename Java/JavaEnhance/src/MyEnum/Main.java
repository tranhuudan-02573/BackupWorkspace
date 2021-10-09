package MyEnum;

enum Planet {
	MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

	int number;

	Planet(int number) {
		this.number = number;
	}
}

public class Main {

	public static void main(String[] args) {

		// enum = enumerated (ordered listing of items in a collection)
		// grouping of constants that behave similarly to objects

		Planet myPlanet = Planet.PLUTO;

		canILiveHere(myPlanet);

	}

	static void canILiveHere(Planet myPlanet) {

		switch (myPlanet) {
		case EARTH:
			System.out.println("You can live here :)");
			System.out.println("This is planet #" + myPlanet.number);
			break;
		default:
			System.out.println("You can't live here...yet");
			System.out.println("This is planet #" + myPlanet.number);
			break;
		}
	}

}
