package AbstractFactoryPattern;

public class AbstractFactoryMain {
	
	public static void main(String args[])
	{
		
		AbstractFactory abstractFactory = new ShapeAbstractFactory() ;
		Shape circle = abstractFactory.getShapeFactory().getShape("CIRCLE");
		circle.draw();
		AbstractFactory abstractFactory1 = new ColorAbstractFactory();
		Color paint=abstractFactory1.getColorFactory().getColor("RED");
		paint.paint();
		
	}

}
