package creational.factormethod.pattern;

public class PhilipsHeadPhonesShop extends HeadPhonesShop{

	@Override
	HeadPhones createHeadPhone() {
		
		System.out.println("Creating Philips HeadPhones");
		
		return new PhilipsHeadPhones();
	}

}
