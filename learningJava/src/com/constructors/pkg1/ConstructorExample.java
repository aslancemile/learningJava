package com.constructors.pkg1;

public class ConstructorExample {
	
	public ConstructorExample() { 
		System.out.println("no argument constructor");
	}
	
	
	public ConstructorExample(int i) { 
		System.out.println("Integer  constructor");
	}
	
	
	public ConstructorExample(int i, int y) { 
		System.out.println("2 Integer constructor");
	}
	
	
	public ConstructorExample(String s) { 
		System.out.println("String constructor");
	}

	
	public static void main(String[] args) {
		
		ConstructorExample ce = new ConstructorExample(5);
		
		
	}
}
