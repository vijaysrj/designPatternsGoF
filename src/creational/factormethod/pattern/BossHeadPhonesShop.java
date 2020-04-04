package creational.factormethod.pattern;

public class BossHeadPhonesShop extends HeadPhonesShop{

	@Override
	HeadPhones createHeadPhone() {
		
		System.out.println("Creating Boss Head Phones");
		return new BossHeadPhones();
	}

	
	
	
	
}
