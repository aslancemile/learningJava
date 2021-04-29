package learningJava;

public class Methods {

	public static void main(String[] args) {
		
		Methods md = new Methods();  // Create an object of Main
		md.doLogin();    // Call the public method on the object
		doLogout();  //access to static method
		System.out.println(md.addNumbers(10, 15));
		md.diffParameters("Ths is string", 12, 23);
		
	}
	
	
	public static void doLogin()
	{
		
	}
	
	
	public static void doLogout()
	{
		
	}
	
	
	public int addNumbers(int x, int y)
	{
		
		return x+y;
	}
	
	
	public void diffParameters(String s, int i, float f)
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		
	}

}
