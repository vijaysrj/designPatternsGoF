package creational.abstractfactory.pattern;

public class KidsShirtFactory implements ShirtFactory {

	@Override
	public Shirt createShirt(String sizeType, String style, boolean isFullHand, String color) {

		Shirt shirt = new KidsShirt(sizeType, style, isFullHand, color);

		return shirt;
	}

}
