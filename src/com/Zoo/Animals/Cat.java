package com.Zoo.Animals;

import com.Zoo.Food.CannedPate;
import com.Zoo.Food.Food;

public class Cat extends Animal {

	//конструктор по умолчанию, без параметров
	public Cat() {
		super();
		setAnimalSpeciesStats();
	}

	public Cat(String name, int age) {
		super(name, age);
		setSpeciesStats();
	}

	private void setSpeciesStats() {
		setAnimalType("Кошка");
		setHowSaying("\"мяу\"");
	}

	@Override
	public void feed(Food food) {
		super.feed(food);
		if (food instanceof CannedPate) {
			System.out.println(getName() + " накормлена паштетом!");
			System.out.println(getName() + " начала бегать");
		}
	}
}

