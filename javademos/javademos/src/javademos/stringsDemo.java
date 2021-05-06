package javademos;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+ mesaj.length());
		System.out.println("5.Elemen: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj.startsWith("B")); // b ile ba�larsa true d�nd�r�r yoksa false
		System.out.println(mesaj.endsWith(".")); // noktayla bitiyorsa true d�nd�r�r.
		char[] karakterler= new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		System.out.println("-----------------");
		
		String yeniMesaj= (mesaj.replace(' ','-')); //bo�luk g�rd��� yerlere �izgi koyar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));  // 2den ba�la 4e kadar 
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime); //b�t�n kelimeleri alt ata yazar 
		}
		
		System.out.println(mesaj.toLowerCase()); //mesaj� k���k harfe �evirir.
		System.out.println(mesaj.toUpperCase()); //mesaj� b�y�k harfe �evirir.
		System.out.println(mesaj.trim()); // mesaj�n ba��ndaki ve sonundaki bo�luklar� atar.
	}

}
