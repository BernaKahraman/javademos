package abstractDemo;

public class CustomerManager{
	
	BaseDatabaseManager databaseManager; //base sınıf hangi veritabanını verirsek onun datası çalışır
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
