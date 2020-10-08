package factory.abstraction.family.animal.impl;

import factory.abstraction.family.animal.Animal;

public class Duck implements Animal {

	@Override
	public String getAnimal() {
		return "Duck";
	}

	@Override
	public String makeSound() {
		return "MacMac";
	}

}
