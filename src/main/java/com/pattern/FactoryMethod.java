package com.pattern;

/**
 * @author sumit
 *	Cons 
 *	Cant user Animal interface to define factory method
 *	Need Extra class to define factory method 
 */
public class FactoryMethod {
	public static void main(String[] args) {

	}
}

interface Animal {}
class Dog implements Animal {}
class Cat implements Animal {}

class AnimalFactory {
	public static Animal newAnimal(String kind) {
		if("cat".equals(kind)) return new Cat();
		if("dog".equals(kind)) return new Dog();
		throw new IllegalArgumentException();
	}
}
