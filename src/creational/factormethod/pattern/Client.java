package creational.factormethod.pattern;

public class Client {
	
	
	public static void main(String a[]) {
		
		
		HeadPhonesShop bossShop = new BossHeadPhonesShop();
		bossShop.sellHeadPhone();
		
		HeadPhonesShop philipsShop = new PhilipsHeadPhonesShop();
		philipsShop.sellHeadPhone();
	}

}
