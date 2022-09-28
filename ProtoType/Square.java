package ProtoType;

public class Square extends Shape {

	private double dim;

	public Square() {
		super("Square");
	}

	public void setDimension(double dim) {
		this.dim = dim;
	}

	public double getArea() {
		return dim * dim;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Square cloneSquare = new Square();
		return cloneSquare;
	}

}
