package learningJava;

public class IfElse {
	public static void main(String[] args) {
		
		
		int num1 = 200;
		int num2 = 100;
		int num3 = 30;
		
		if(num1 > num2){
			
			System.out.println("Number 1 is greater than number 2");
			
			if(num2<num3)
			{
				System.out.println("Within nested if else");
			}
			else
			{
				System.out.println("In the nested else block");
			}
		}
		
		else if(num1 == num2)
		{
			System.out.println("Number 1 is equal to num2");
		}
		else if(num1<num2)
		{
			System.out.println("Number 1 is less than num2");
		}
		else
		{
			System.out.println("Number 1 is less than num2");
		} 
	}

}
