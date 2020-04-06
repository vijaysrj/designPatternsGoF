package creational.abstractfactory.pattern;

public class Client {
	
	
	public static void main(String a[]) {
		
		
		DressFactory kidsFactory = new KidsDressFactory();
		
		kidsFactory.createShirt("small", "contemporary", true, "blue");
		kidsFactory.createPant("small", "contemporary", false, "white");
		
		kidsFactory.packDress();

				
		
		DressFactory womensFactory = new WomenDressFactory();
		
		womensFactory.createShirt("medium", "classical", false, "yellow");
		womensFactory.createPant("medium", "classical", false, "blue");
		
		womensFactory.packDress();
		
	}

}
