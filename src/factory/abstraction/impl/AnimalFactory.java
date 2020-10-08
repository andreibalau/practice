package factory.abstraction.impl;

import factory.abstraction.AbstractFactory;
import factory.abstraction.family.animal.Animal;
import factory.abstraction.family.animal.impl.AnimalEnum;
import factory.abstraction.family.animal.impl.Dog;
import factory.abstraction.family.animal.impl.Duck;

public class AnimalFactory implements AbstractFactory<Animal, AnimalEnum> {

	@Override
	public Animal create(AnimalEnum type) {
		switch (type) {
		case DOG:
			return new Dog();
		case DUCK:
			return new Duck();
		default:
			throw new IllegalArgumentException("Provide AnimalEnum value");

		}
	}

}
