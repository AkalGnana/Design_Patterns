package Abstract_Factory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {

		return null;
	}

}
