package com.encapsulation.pkg1;

public class Common {
	
	private int length;
	private int width;
	private int height;
	
	public void setBoxDimension(int l, int w, int h)
	{
		
		if(l>=1 && w>=1 && h>=1)
		{
			System.out.println("Box created with dimesions "+l+" "+w+" "+h+" ");
		}
		else {
			System.out.println("Invalid dimensions");
		}
		
		
	}
	
	public int setLength(int l)
	{
		if(l>=1)
		{
			length=l;
		}
		else {
			System.out.println("Invalid length");
		}
		return length;
	}
	
	public int setWidth(int w)
	{
		width=w;
		return width;
	}
	
	public int setHeight(int h)
	{
		height=h;
		return height;
	}
	public int getLength()
	{
		
		return length;
	}
	
	public int getWidth()
	{
		
		return width;
	}
	
	public int getHeight()
	{
		
		return height;
	}
	
	

}
