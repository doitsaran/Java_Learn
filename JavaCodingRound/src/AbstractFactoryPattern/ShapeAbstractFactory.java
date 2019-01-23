package AbstractFactoryPattern;

public class ShapeAbstractFactory extends AbstractFactory{

	@Override
	public ShapeFactory getShapeFactory() {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		return shapeFactory;
	}

	@Override
	public ColorFactory getColorFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
