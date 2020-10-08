package factory.abstraction.family.animal.impl;

import factory.abstraction.family.animal.Animal;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "Dog";
	}

	@Override
	public String makeSound() {
		return "HamHam";
	}

}
