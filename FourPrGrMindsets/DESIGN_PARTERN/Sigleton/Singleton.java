package Sigleton;

public class Singleton {

	private Singleton() {

	}

	private static class Test {
		private static final Singleton singleton = new Singleton();
	}

	// Reflection
	public static Singleton getInstance() {
		return Test.singleton;
	}

}
