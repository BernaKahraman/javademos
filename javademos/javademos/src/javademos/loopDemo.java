package javademos;

public class loopDemo {

	public static void main(String[] args) {
		
		//For 
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("D�ng� bitti.");
		
		//While
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While d�ng�s� bitti.");
		
		//Do-While
		int j=100;
		do {
	
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("Do-While D�ng�s� bitti.");
	}

}
