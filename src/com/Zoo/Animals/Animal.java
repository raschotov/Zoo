package com.Zoo.Animals;

import com.Zoo.Feedable;
import com.Zoo.Food.Food;
import com.Zoo.Food.RatPoison;
import com.Zoo.Food.Vomitive;

public abstract class Animal implements Feedable {
	private int age;
	private String howSaying;
	private String name;
	private boolean isDead;
	private String animalType;

	//Методы
	public void say() {
		System.out.println (this.getAnimalType() + " " + this.getName() + " говорит " + howSaying + ".");
	}
	public void tellAge() {
		System.out.println ("Сейчас ей " + this.getAge() + " лет.");
	}
	public void getInfo() {
		say();
		tellAge();
		System.out.println();
	}
	public void feed(Food food) {
		if (food instanceof RatPoison) {
			this.kill();
			System.out.println(getName() + " отравлен крысиным ядом!");
			System.out.println(getName() + " умер!");
		}
		if (food instanceof Vomitive) {
			System.out.println(getName() + " вырвало");
		}
	}

	//Сеттеры
	public void kill() {this.isDead = true;}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public void setHowSaying(String howSaying) {
		this.howSaying = howSaying;
	}
	public void setAnimalSpeciesStats() {
		switch (this.getAnimalSpecies()) {
			case ("Cat"):
				setAnimalType("Кошка");
				setHowSaying("\"мяу\"");
				break;
			case ("Dog"):
				setAnimalType("Dog");
				setHowSaying("\"гав-гав\"");
				break;
			case (""):
			default:
				break;
		}
	}

	//Геттеры
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getAnimalType(){
		return this.animalType;
	}
	public boolean getIsDead() {
		return this.isDead;
	}
	public String getAnimalSpecies() {
		String animalSpecies = this.getClass().getSimpleName();
		return  animalSpecies;
	}

	//Конструкторы
	//попытка запилить конструктор абстрактного класса (чтобы не дублировать код)
	Animal() {
		this.name = "(имя неизвестно)";
		this.age = 0;
		this.isDead = false;
	}
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.isDead = false;
	}

}