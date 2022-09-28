package ThreadSafe_SingletonTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ThreadSafe_Singleton.MyThread;

public class Client_Test {

	public static void main(String[] args) {
		ExecutorService excecuterService=null;
		MyThread myThread=new MyThread();
		try {
			excecuterService= Executors.newFixedThreadPool(1);
			excecuterService.execute(myThread);
//			excecuterService.execute(myThread);
//			excecuterService.execute(myThread);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(excecuterService!=null) {
				excecuterService.shutdown();
			}
		}
	}
}
