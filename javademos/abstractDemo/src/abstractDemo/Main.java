package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		customerManager.databaseManager= new OracleDatabaseManager(); //müþteri oracle deðil sql isterse bu kýsým deðiþicek sadece
		customerManager.getCustomers();

	}

}
