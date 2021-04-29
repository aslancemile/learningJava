package com.polymorphism.pkg1;

public class MethodOverloaing {

	public static void main(String[] args) {
		
		 MethodOverloaing mo = new  MethodOverloaing();
		 mo.login(45454, "password");
		
	}

	public void login(String s, String p)
	{
		System.out.println("Login successful using username and password");
	}
	
	public void login(int s, String p)
	{
		System.out.println("Login successful using phonenumber and password");
	}
	
	
	public void login(int s, String p, int t)
	{
		System.out.println("Login successful using ponenumber/pin and password");
	}

}
