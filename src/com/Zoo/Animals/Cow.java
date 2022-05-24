package com.Zoo.Animals;

public class Cow extends Animal {
	Cow() {
		super();
		setSpeciesStats();
	}

	public Cow(String name, int age) {
		super();
		setSpeciesStats();
	}

	private void setSpeciesStats() {
		setAnimalType("Корова");
		setHowSaying("\"мууу\"");
	}
}