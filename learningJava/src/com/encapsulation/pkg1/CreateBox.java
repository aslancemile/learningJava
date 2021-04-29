package com.encapsulation.pkg1;

public class CreateBox {

	public static void main(String[] args) {

		Common cm = new Common();
		//int h = cm.height=0;
		//int l = cm.length=-10;
		//int w = cm.width=0;
		
		int w = cm.setWidth(10);
		int l = cm.setLength(20);
		int h = cm.setHeight(15);
		
		cm.setBoxDimension(l, w, h);
		
		System.out.println(cm.getLength());
		
	}

}
