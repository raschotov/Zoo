package com.Zoo;

import com.Zoo.Animals.*;
import com.Zoo.Food.*;
import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		ArrayList animalList = new ArrayList<Animal>();

		hello();
		createAnimals();
		//Barn.makeBarn();


	}

	static private void hello() {
		System.out.println("Hello everyone");
		System.out.println();
	}
	static private void createAnimals() {
		Cat cat1 = new Cat();
		cat1.getInfo();
		cat1.getAnimalSpecies();

		Cat cat2 = new Cat("Герцогиня", 4);
		cat2.getInfo();

		Dog dog1 = new Dog("Псина", 7);
		dog1.getInfo();

		Cow cow1 = new Cow("бурёнка", 3);
		cow1.getInfo();

		Pig pig1 = new Pig();
		pig1.getInfo();

		Pig pig2 = new Pig("Хрюша", 1);
		pig2.getInfo();

		Food ratPoison = new RatPoison();
		dog1.feed(ratPoison);

		Food cannedPate = new CannedPate();
		cat2.feed(cannedPate);
	}

	/*
	static private void tellAboutAnimals() {
		cat1.say();
		cat1.tellAge();
	}
	 */

	//а как сделать разные типы животных, а не кота?
	public static void createSomeAnimals(ArrayList<Animal> arrayList, int count) {
		for (int i = 0; i < count; i++) {
			arrayList.add(new Cat());
		}
	}
}