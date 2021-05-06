package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); //a�a��daki method �a��r�ld�
	}
	
	////// camel casing: javada method isimleri ilk kelime k���k ikinci kelimenin ba� harfi b�y�k yaz�l�r
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
			mesaj("Say� mevcuttur: "+ aranacak);
		}else {
			mesaj("Say� mevcut de�ildir: "+ aranacak);
		}

	}
	
	public static void mesaj(String mesaj) {
		System.out.println(mesaj);
	}
}

