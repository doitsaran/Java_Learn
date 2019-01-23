package AbstractFactoryPattern;

public class ColorFactory  {
	
	public Color getColor(String colorName)
	{
		Color color = null;
		if (colorName == "RED") {
			color = new Red();
		}
		else if (colorName == "YELLOW") {
			color = new Yellow();
		}
		else if(colorName == "GREEN") {
			color = new Green();
		}

		return color;
	}

	
}
