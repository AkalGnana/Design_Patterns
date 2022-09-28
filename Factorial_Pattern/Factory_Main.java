package Factorial_Pattern;

import Factory_2.OS;
import Factory_2.OS_Factory;

public class Factory_Main {

	public static void main(String[] args) {
		
		OS_Factory osf=new OS_Factory();
		OS obj=osf.getInstance("Closed");
		obj.special();

//		OS obj1=new Windows();
//		obj1.special();
//		
//		OS obj2=new IOS_1();
//		obj2.special();


	}

}
