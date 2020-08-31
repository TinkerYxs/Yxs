package yxs.DP.AbstractFactory.factory;

import yxs.DP.AbstractFactory.color.Blue;
import yxs.DP.AbstractFactory.color.Color;
import yxs.DP.AbstractFactory.color.Green;
import yxs.DP.AbstractFactory.color.Red;
import yxs.DP.AbstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}