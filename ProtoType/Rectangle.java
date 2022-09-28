package ProtoType;

public class Rectangle extends Shape implements Cloneable {
	private double length;
	private double breadth;

	public Rectangle() {
		super("Rectangle");
	}

	public void setlength(double length) {
		this.length = length;
	}

	public void setbreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getArea() {
		return length * breadth;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Rectangle clonedrectangle = new Rectangle();
		return clonedrectangle;
	}

}
