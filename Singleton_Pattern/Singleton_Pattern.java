package Singleton_Pattern;

public class Singleton_Pattern {

	private static Singleton_Pattern singleton;
	// public String s;

	private Singleton_Pattern() {
		// s="rfrtgtrghtyhyuh";

	}

	public static Singleton_Pattern getInstance() {
		if (singleton == null) {
			singleton = new Singleton_Pattern();
		}
		return singleton;
	}

	public void displayMessage() {
		System.out.println("I have called using singletone object"); // singleton.s
	}
}
