package factory;

import factory.abstraction.AbstractFactory;
import factory.abstraction.family.animal.Animal;
import factory.abstraction.family.animal.impl.AnimalEnum;
import factory.abstraction.family.color.Color;
import factory.abstraction.family.color.impl.ColorEnum;
import factory.abstraction.impl.AnimalFactory;
import factory.abstraction.impl.ColorFactory;

public class Main {

	// Three ways of using Factory pattern that I impl
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		AbstractFactory<Animal, AnimalEnum> a = new AnimalFactory();
		System.out.println(a.create(AnimalEnum.DOG).getAnimal());

		Animal duck = (Animal) FactoryProvider.getFactory(FactoryEnum.ANIMAL).create(AnimalEnum.DUCK);
		System.out.println(duck.getAnimal());

		ColorFactory abstractFactory = FactoryProvider.newColorFactoryInstance();
		Color black = abstractFactory.create(ColorEnum.Black);
		System.out.println(black);
	}

}
