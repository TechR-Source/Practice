package udemy;

public class Method3 {

	public void checkoutPage() {
		
		System.out.println("This is the checkout Page");
		

		
		Method2 m2 = new Method2();
		m2.bannerBlock();
		
		
	}


	public String paymentMethod(){
		System.out.println("This is the payment block");
		return "true";
	}
	
	
	public void paypalMethod(){
		System.out.println("This is the paypal payment method");
		
	}
}
