package javademos;

public class arraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("--------------------");
		
		String[] ogrenciler= new String [3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------------");
		
		for(String ogrenci:ogrenciler) { //ogrenciler dizisindeki her bir eleman� gez 
			System.out.println(ogrenci);
		}
		
	}

}