package com.inheritance.pkg1;

public class Iveco extends Truck{

	
	public static void main(String[] args) {
		
		Iveco iv = new Iveco();
		iv.loadCapacity();
		iv.start();
		iv.stop();
		
		// vehicle -> truck child -> ýveco    multilevel inheritence 
		// vehicle parent class, truck child class, ýveco sub child class
	}
}
