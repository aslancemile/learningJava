package com.accessmodifiers.pkg2;

import com.accessmodifiers.pkg1.ClassA;
//import com.accessmodifiers.pkg1.*;

public class ClassC extends ClassA{
	
	public static void main(String[] args) {
		
		/*ClassA ca = new ClassA();
		ca.publicMethod();
		*/
		
		ClassC cb = new ClassC();
		cb.protectedMethod();
		
		
		
	}

}
