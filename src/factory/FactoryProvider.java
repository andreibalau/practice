package factory;

import factory.abstraction.AbstractFactory;
import factory.abstraction.impl.AnimalFactory;
import factory.abstraction.impl.ColorFactory;

public class FactoryProvider {

	@SuppressWarnings("rawtypes")
	public static AbstractFactory getFactory(FactoryEnum factory) {
		switch (factory) {
		case ANIMAL:
			return new AnimalFactory();
		case COLOR:
			return new ColorFactory();
		default:
			throw new IllegalArgumentException("No such factory");
		}

	}

	public static AnimalFactory newAnimalFactoryInstance() {
		return new AnimalFactory();
	}

	public static ColorFactory newColorFactoryInstance() {
		return new ColorFactory();
	}
}
