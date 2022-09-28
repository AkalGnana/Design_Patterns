package Factory_2;

public class OS_Factory {

	public OS getInstance(String str) {
		if(str.equals("Open"))
			return new Windows();
		else if(str.equals("Closed"))
			return new Linux();
		else
			return new IOS_1();
	}
}
