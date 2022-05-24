package com.Zoo.Animals;

public class Dog extends Animal {
	Dog() {
		super();
		setSpeciesStats();
	}

	public Dog(String name, int age) {
		super();
		setSpeciesStats();
	}

	private void setSpeciesStats() {
		setAnimalType("Собака");
		setHowSaying("\"гав-гав\"");
	}
}