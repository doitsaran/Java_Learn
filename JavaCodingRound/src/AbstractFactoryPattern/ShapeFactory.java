package AbstractFactoryPattern;

public class ShapeFactory {

	public Shape getShape(String shapeName) {
		Shape shape = null;
		if (shapeName == "CIRCLE") {
			shape = new Circle();
		}
		if (shapeName == "SQUARE") {
			shape = new Square();
		}
		if (shapeName == "RECTANGLE") {
			shape = new Rectangle();
		}

		return shape;
	}

}
