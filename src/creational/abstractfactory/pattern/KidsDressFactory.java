package creational.abstractfactory.pattern;

public class KidsDressFactory extends DressFactory {

	@Override
	public void createShirt(String sizeType, String style, boolean isFullHand, String color) {
		
		System.out.println("Creating Kids Shirt");

		ShirtFactory shirtFactory = new KidsShirtFactory();
		this.shirt = shirtFactory.createShirt(sizeType, style, isFullHand, color);

	}

	@Override
	public void createPant(String sizeType, String style, boolean isHalfPant, String color) {

		System.out.println("Creating Kids Pant");
		
		PantFactory pantFactory = new KidsPantFactory();


		this.pant = pantFactory.createPant(sizeType, style, isHalfPant, color);
	}

	@Override
	public void packDress() {
		
		
		System.out.println();
		System.out.println("Packing kids dress with shirt: " + this.shirt + "\n and pant:" + this.pant);
		System.out.println();

	}

}
