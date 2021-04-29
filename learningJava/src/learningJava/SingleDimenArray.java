package learningJava;

public class SingleDimenArray {

	public static void main(String[] args) {
		
		
		int myInt = 2;
		int[] myIntArray = new int[10];
		myIntArray[0] = 10;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		myIntArray[3] = 40;
		System.out.println(myIntArray[3]);
		System.out.println(myIntArray.length);
		
		int[] myIntArray1 = {10, 20, 30, 40, 50};
		int myIntArray2[] = {10, 20, 30, 40, 50};
		System.out.println(myIntArray1[1]);
		System.out.println(myIntArray1.length);
		
		
		int[] myIntArray3= {10,20,30,40,50,60,70};
		
		for(int i=0; i<myIntArray3.length; i++)
		{
			System.out.println(myIntArray3[i]);
		}
		
		
		
		String[] myStringArray=new String[5];
		byte[] anArrayOfBytes;
		short[] anArrayOfShorts;
		long[] anArrayOfLongs;
		float[] anArrayOfFloats;
		double[] anArrayOfDoubles;
		boolean[] anArrayOfBooeans;
		char[] anArrayOfChars;
		String[] anArrayOfStrings;

	}

}
