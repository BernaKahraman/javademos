package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); //aþaðýdaki method çaðýrýldý
	}
	
	////// camel casing: javada method isimleri ilk kelime küçük ikinci kelimenin baþ harfi büyük yazýlýr
	//method:
	public static void sayiBulmaca() {
		int[]sayilar= new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			mesaj("Sayý mevcuttur: "+ aranacak);
		}else {
			mesaj("Sayý mevcut deðildir: "+ aranacak);
		}

	}
	
	public static void mesaj(String mesaj) {
		System.out.println(mesaj);
	}
}

