package abstractDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager= new CustomerManager();
		customerManager.databaseManager= new OracleDatabaseManager(); //m��teri oracle de�il sql isterse bu k�s�m de�i�icek sadece
		customerManager.getCustomers();

	}

}
