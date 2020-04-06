package creational.abstractfactory.pattern;

public class WomensShirtFactory implements ShirtFactory {

	@Override
	public Shirt createShirt(String sizeType, String style, boolean isFullHand, String color) {
	
		Shirt shirt = new WomenShirt(sizeType, style, isFullHand, color);

		return shirt;

	}

}
