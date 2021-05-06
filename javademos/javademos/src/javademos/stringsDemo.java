package javademos;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý: "+ mesaj.length());
		System.out.println("5.Elemen: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("B")); // b ile baþlarsa true döndürür yoksa false
		System.out.println(mesaj.endsWith(".")); // noktayla bitiyorsa true döndürür.
		char[] karakterler= new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		System.out.println("-----------------");
		
		String yeniMesaj= (mesaj.replace(' ','-')); //boþluk gördüðü yerlere çizgi koyar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));  // 2den baþla 4e kadar 
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime); //bütün kelimeleri alt ata yazar 
		}
		
		System.out.println(mesaj.toLowerCase()); //mesajý küçük harfe çevirir.
		System.out.println(mesaj.toUpperCase()); //mesajý büyük harfe çevirir.
		System.out.println(mesaj.trim()); // mesajýn baþýndaki ve sonundaki boþluklarý atar.
	}

}
