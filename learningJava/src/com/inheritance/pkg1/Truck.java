package com.inheritance.pkg1;

public class Truck extends VehicleCommon{

	public static void main(String[] args) {
		
		Truck tk = new Truck();
		tk.start();
		tk.stop();
		

		// VehicleCommon = parent class
		// Truck = child class
		// single ýnheritance
	}

	public void loadCapacity()
	{
		System.out.println("Load ");
	}
	
	
	
	
	
	
}
