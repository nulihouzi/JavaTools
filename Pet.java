package com.eclipse.test;

/**
 * 演示Java的参数值传递
 * 
 * @author Miracle
 * Created on 2016-02-24 11:15.
 */
public class Pet {
	class Dog {
		private int speed;
		
		Dog(int speed) {
			this.speed = speed;
		}
		
		public void run(Dog dog) {
			dog.speed++;
		}
	}
	
	public static void main(String[] args) {
		Pet pet = new Pet();
		Dog dog = pet.new Dog(10);
		dog.run(dog);
		System.out.println(dog.speed);
	}
}