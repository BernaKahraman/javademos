package abstractDemo;

public class CustomerManager{
	
	BaseDatabaseManager databaseManager; //base s�n�f hangi veritaban�n� verirsek onun datas� �al���r
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
