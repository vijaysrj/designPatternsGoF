package creational.abstractfactory.pattern;

public class WomenDressFactory extends DressFactory {

	@Override
	public void createShirt(String sizeType, String style, boolean isFullHand, String color) {

		System.out.println("Creating Womens Shirt");
		
		ShirtFactory shirtFactory = new WomensShirtFactory();

		this.shirt = shirtFactory.createShirt(sizeType, style, isFullHand, color);

	}

	@Override
	public void createPant(String sizeType, String style, boolean isHalfPant, String color) {
		
		System.out.println("Creating Womens Pant");
		
		PantFactory pantFactory = new WomensPantFactory();

		this.pant = pantFactory.createPant(sizeType, style, isHalfPant, color);

	}

	@Override
	public void packDress() {

		System.out.println();
		System.out.println("Packing Womens dress with shirt: " + this.shirt + "\n and pant:" + this.pant);
		System.out.println();

	}

}
