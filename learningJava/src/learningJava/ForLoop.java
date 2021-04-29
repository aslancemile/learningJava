package learningJava;

public class ForLoop {

	public static void main(String[] args) {
	
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		
		
		
		// break komutu ile döngüyü kýrýp sonlandýrýrken continue komutu ise sadece koþulun saðladýðý adýmý atlar ve devam eder.
		
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}

	}

}
