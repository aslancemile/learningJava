package learningJava;

public class StringLiteralVsObject {

	public static void main(String[] args) {
	
		
		String s1 = "DT";
		String s2 = "DT";
		String s3 = new String("DT"); //object
		String s4 = new String("DT"); //object   
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

	}


