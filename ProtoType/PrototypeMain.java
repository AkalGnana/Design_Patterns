package ProtoType;

import java.util.HashMap;
import java.util.Map;

public class PrototypeMain {
	public static Map<String, Shape> shapeCache = new HashMap<>();

	private static Shape getBashShape(String ShapeType) throws CloneNotSupportedException {
		if (ShapeType.equalsIgnoreCase("square")) {
			if (shapeCache.containsKey("square")) {
				Shape square = (Shape) shapeCache.get("square").clone();
				return square;
			} else {
				Shape square = new Square();
				shapeCache.put(ShapeType, square);
				return square;
			}
		} else if (ShapeType.equalsIgnoreCase("rectangle")) {
			if (shapeCache.containsKey("rectangle")) {
				Shape rectangle = (Shape) shapeCache.get("rectangle").clone();
				return rectangle;
			} else {
				Shape rectangle = new Rectangle();
				shapeCache.put(ShapeType, rectangle);
				return rectangle;
			}

		}
		return null;

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Square square1 = (Square) getBashShape("square");
		Square square2 = (Square) getBashShape("square");

		square1.setDimension(5);
		square2.setDimension(10);

		System.out.println("Square 1 Area is : " + square1.getArea());
		System.out.println("Square 2 Area is : " + square2.getArea());

		Rectangle rectangle1 = (Rectangle) getBashShape("rectangle");
		Rectangle rectangle2 = (Rectangle) getBashShape("rectangle");

		rectangle1.setlength(2);
		rectangle1.setbreadth(1);

		System.out.println("Rectangle 1 Area is : " + rectangle1.getArea());

		rectangle2.setlength(4);
		rectangle2.setbreadth(2);

		System.out.println("Rectangle 1 Area is : " + rectangle2.getArea());

	}

}
