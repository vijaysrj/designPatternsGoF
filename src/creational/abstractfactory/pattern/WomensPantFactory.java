package creational.abstractfactory.pattern;

public class WomensPantFactory implements PantFactory {

	@Override
	public Pant createPant(String sizeType, String style, boolean isHalfPant, String color) {

		Pant pant = new WomenPant(sizeType, style, isHalfPant, color);

		return pant;

	}

}
