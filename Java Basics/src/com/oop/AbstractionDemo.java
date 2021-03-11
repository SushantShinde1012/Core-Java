package com.oop;
/* 
 * Abstraction :
 * 
 * 		- In general abstract is outline of topic or overview
 * 
 * 		- Hide internal implementation and highlight what services we offer
 * 
 * 		- e.g. ATM Machine
 * 
 * 		- Showing what we offer but hiding how we offer.
 * 
 * 		- Advantages
 * 
 * 			- Security
 * 
 * 			- Enhancement become easy without affecting users
 * 	
 * 		- We can implement  Abstraction through
 * 
 * 			1. Full Abstraction -> Interface
 * 
 * 			2. Partial Abstraction -> Abstract Class
 */
//Abstract class
abstract class Animal {
		// Abstract method (does not have a body)
		public abstract void animalSound();
		// Regular method
		public void sleep() {
				System.out.println("Zzz");
		}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
			Pig myPig = new Pig(); // Create a Pig object
			myPig.animalSound();
			myPig.sleep();
}
}