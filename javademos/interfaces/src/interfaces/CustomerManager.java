package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal; //baðýmlý olmamak için 

	
	//baðýmlý olmamak için tercih edilen kullaným:
	//Yani: ICustomerDal'dan sql oracle vs çaðýrabiliriz
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal= customerDal;
	}
	
	public void Add() {
		//iþ kodlarý 
		customerDal.Add();
	}
}
