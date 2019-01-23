package AbstractFactoryPattern;

public class ColorAbstractFactory extends AbstractFactory {

	@Override
	public ShapeFactory getShapeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ColorFactory getColorFactory() {
		// TODO Auto-generated method stub
		ColorFactory colorFactory =new ColorFactory(); ;
		return colorFactory;
	}

}
