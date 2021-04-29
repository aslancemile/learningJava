package com.polymorphism.pkg1;

public class MethdOverriding_Cat extends MethodOverriding_Animal{

	
	public static void main(String[] args) {
		
		MethdOverriding_Cat c = new MethdOverriding_Cat();
		c.makeNoise();
		
	}
	
	public void makeNoise() {
		
		System.out.println("Cat meows");
	}
	
	
	
}
