package com.Zoo.Animals;

public class Pig extends Animal {


	public Pig() {
		super();
		setSpeciesStats();
	}

	public Pig(String name, int age) {
		super(name, age);
		setSpeciesStats();
	}

	private void setSpeciesStats() {
		setAnimalType("Свинья");
		setHowSaying("\"хрю\"");
	}
}
