package learningJava;

public class ForLoop {

	public static void main(String[] args) {
	
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		
		
		// break komutu ile d�ng�y� k�r�p sonland�r�rken continue komutu ise sadece ko�ulun sa�lad��� ad�m� atlar ve devam eder.
		
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
