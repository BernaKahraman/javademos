package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator= new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
		//absrtact sýnýflar asla newlenemez. 
		//örnek kullaným aþaðýdaki gibi. Yani game game olamaz. game woman-man-kids olur.
		GameCalculator gameCalculator= new WomanGameCalculator();

	}

}
