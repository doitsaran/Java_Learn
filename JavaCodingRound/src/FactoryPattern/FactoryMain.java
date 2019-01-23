package FactoryPattern;

public class FactoryMain {
	
	public static void main(String args[])
	{
		ShapeFactory factory = new ShapeFactory();
		
		Shape s1 =factory.getShape("CIRCLE");
		s1.draw();
		Shape s2 =factory.getShape("SQUARE");
		s2.draw();
		Shape s3 =factory.getShape("RECTANGLE");
		s3.draw();
		
		
	}

}
