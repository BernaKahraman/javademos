package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal; //ba��ml� olmamak i�in 

	
	//ba��ml� olmamak i�in tercih edilen kullan�m:
	//Yani: ICustomerDal'dan sql oracle vs �a��rabiliriz
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	
	public void Add() {
		//i� kodlar� 
		customerDal.Add();
	}
}
