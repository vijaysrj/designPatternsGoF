package creational.factormethod.pattern;

public class PhilipsHeadPhonesShop implements HeadPhonesShop{

	@Override
	public HeadPhones createHeadPhone() {
		
		System.out.println("Creating Philips HeadPhones");
		
		return new PhilipsHeadPhones();
	}

}
