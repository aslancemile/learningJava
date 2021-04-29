package com.superkeyword.pkg1;

public class Child extends Parent{
	
	public Child() {
		super(3);
	}
	
	
	String empName = "Eda";
	int empNo = 1212;
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.getData();
		
	}
	
	public void getData() 
	{
		//super.getData();  // it will call the get data method from the parent class
		//System.out.println(super.empName);
		System.out.println(empName);
		System.out.println(empNo);
		
	}

}
