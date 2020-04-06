package creational.abstractfactory.pattern;

public abstract class DressFactory {

	Shirt shirt;

	Pant pant;

	public abstract void createShirt(String sizeType, String style, boolean isFullHand, String color);

	public abstract void createPant(String sizeType, String style, boolean isHalfPant, String color);

	public abstract void packDress();

}
