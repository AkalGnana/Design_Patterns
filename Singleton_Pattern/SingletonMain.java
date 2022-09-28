package Singleton_Pattern;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton_Pattern single1 = Singleton_Pattern.getInstance();
		Singleton_Pattern single2 = Singleton_Pattern.getInstance();

		single1.displayMessage();
		single2.displayMessage();

	}

}
