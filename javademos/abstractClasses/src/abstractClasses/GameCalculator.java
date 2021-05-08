package abstractClasses;

public abstract class GameCalculator {

	//base k�s�m
	public abstract void hesapla(); //hi�bir �ekilde default olmayacak abstract ekledi�imiz i�in: herkes kendi hesaplamas�n� yazmak zorunda!
	//hesapla operasyonu mutlaka olacak ve kad�n erkek �ocuk i�in �al��acak. Ama herkes kendi hesaplamas�n� yapmal� (ovverride ederek belirtmeli)
	
	public final void gameOver() { //final ekledi�imizde, gamecalculator kim kullan�yorsa bu k�s�m hi� kimse i�in de�i�meyecek demek!
		System.out.println("Oyun bitti");
	}
}
