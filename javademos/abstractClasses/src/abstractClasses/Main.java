package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator= new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
		//absrtact s�n�flar asla newlenemez. 
		//�rnek kullan�m a�a��daki gibi. Yani game game olamaz. game woman-man-kids olur.
		GameCalculator gameCalculator= new WomanGameCalculator();

	}

}
