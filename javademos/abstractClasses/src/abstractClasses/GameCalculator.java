package abstractClasses;

public abstract class GameCalculator {

	//base kýsým
	public abstract void hesapla(); //hiçbir þekilde default olmayacak abstract eklediðimiz için: herkes kendi hesaplamasýný yazmak zorunda!
	//hesapla operasyonu mutlaka olacak ve kadýn erkek çocuk için çalýþacak. Ama herkes kendi hesaplamasýný yapmalý (ovverride ederek belirtmeli)
	
	public final void gameOver() { //final eklediðimizde, gamecalculator kim kullanýyorsa bu kýsým hiç kimse için deðiþmeyecek demek!
		System.out.println("Oyun bitti");
	}
}
