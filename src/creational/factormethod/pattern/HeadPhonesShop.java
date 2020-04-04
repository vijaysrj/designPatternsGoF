package creational.factormethod.pattern;

public abstract class HeadPhonesShop {

	abstract HeadPhones createHeadPhone();

	void sellHeadPhone() {

		HeadPhones headPhone = createHeadPhone();

		
		System.out.println("Rate of HeadPhone"+headPhone.getRate());
		
		System.out.println("Packing and Delivering..");
		
	}


}
