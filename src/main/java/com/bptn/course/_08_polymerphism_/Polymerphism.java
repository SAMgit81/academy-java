package com.bptn.course._08_polymerphism_;

//Parent class
class Animal {

	void makeSound() {
		System.out.println("Animal make a sound");
	}
}

//Sub class
class Dog extends Animal {
	// has its own method

	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}

}

public class Polymerphism {

	public static void main(String[] args) {
		// Create an obj of animal class
		Animal a1 = new Animal();
		a1.makeSound();

		// Create an obj from Dog class
		Dog d1 = new Dog();
		d1.makeSound();

	}

}

//Method overriding 
//Run time polymerphism
