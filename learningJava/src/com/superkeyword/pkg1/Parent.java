package com.superkeyword.pkg1;

public class Parent {
	
	public Parent() {
		
		System.out.println("Parent constructor");
		
	}
	
	public Parent(int i) {
		
		System.out.println("Parametrized constructor");
		
	}
	
	
	
	String empName = "Cemile";
	int empNo = 3535;
			
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
	}

	
	
	
}
