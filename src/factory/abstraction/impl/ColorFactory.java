package factory.abstraction.impl;

import factory.abstraction.AbstractFactory;
import factory.abstraction.family.color.Color;
import factory.abstraction.family.color.impl.Black;
import factory.abstraction.family.color.impl.ColorEnum;
import factory.abstraction.family.color.impl.White;

public class ColorFactory implements AbstractFactory<Color, ColorEnum> {

	@Override
	public Color create(ColorEnum type) {
		switch (type) {
		case Black:
			return new Black();
		case White:
			return new White();
		default:
			throw new IllegalArgumentException("Provide ColorEnum value");

		}
	}

}
