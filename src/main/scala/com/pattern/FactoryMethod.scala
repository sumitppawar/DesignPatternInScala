package com.pattern

/*
 * <p> Creation Pattern </p>
 * Common Interface to Object Creation
 * Hide complex object creation logic
 * Encapsulate object construction
 * 
 * Pros 
 * use trait name for factory
 * use of apply method to construct object
 * 
 */

object FactoryMethod {
  def main(args: Array[String]) {
    println(Animal("cat"))
  }
}

trait Animal 
class Dog extends Animal
class Cat extends Animal

object Animal {
  def apply(kind: String) = kind match {
    case "cat" => new Cat
    case "Dog" => new Dog
  }
}

