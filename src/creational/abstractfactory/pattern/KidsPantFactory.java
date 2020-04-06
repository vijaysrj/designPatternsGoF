package creational.abstractfactory.pattern;

public class KidsPantFactory implements PantFactory {

	@Override
	public Pant createPant(String sizeType, String style, boolean isHalfPant, String color) {

		Pant pant = new KidsPant(sizeType, style, isHalfPant, color);
		return pant;
	}

}
