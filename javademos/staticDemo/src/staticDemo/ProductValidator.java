package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static Yap?c? blok ?al??t?");
	}
	
	//?r?n? kaydet- g?ncelle yaparken kurallara uygun olup olmad???n? test eder
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	
	
}
