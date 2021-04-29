package com.interfacee.pkg1;

public class Circle implements Shapes{

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.drawShape();
		

	}

	@Override
	public void drawShape() {
		System.out.println("draw circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("draw circle");
		
	}

	@Override
	public void moveShape() {
		System.out.println("draw circle");
		
	}

}
