package ThreadSafe_Singleton;

public class Singleton {

	private static Singleton singleton;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton ==null) {
			synchronized(Singleton.class) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			singleton=new Singleton();
		}
		}
	
		return singleton;
	}
	public void displayMessage() {
		System.out.println("I have called using singletone object");
	}
}

