package creational.factormethod.pattern;

public class BossHeadPhonesShop implements HeadPhonesShop{

	@Override
	public HeadPhones createHeadPhone() {
		
		System.out.println("Creating Boss Head Phones");
		return new BossHeadPhones();
	}

	
	
	
	
}
