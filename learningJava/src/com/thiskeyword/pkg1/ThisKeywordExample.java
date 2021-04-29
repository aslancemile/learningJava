package com.thiskeyword.pkg1;

public class ThisKeywordExample {
	
	//instance variable
	int x;
	int y;
	
	public ThisKeywordExample() 
	{
		System.out.println("default");
		
	}
	
	public ThisKeywordExample(int x, int y) 
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("default");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ThisKeywordExample tk = new ThisKeywordExample(4,7);
		tk.getData();
		tk.getData1();
	}
	
	public void getData() {
		
		System.out.println(this.x+this.y);
		
		/*//local variable
		int x=50;
		int y=40; 
		System.out.println(this.x+this.y);   //instance variable
		System.out.println(x+y);  	//local variable
		this.getData1(); */
	}
	
	public void getData1() {
		
		int x=50;
		int y=40; 
		System.out.println(this.x+this.y);   
		System.out.println(x+y);  	
	}

}
