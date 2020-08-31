package yxs.DP.AbstractFactory.factory;

import yxs.DP.AbstractFactory.color.Color;
import yxs.DP.AbstractFactory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}