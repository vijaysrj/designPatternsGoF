package creational.abstractfactory.pattern;

public interface ShirtFactory {

	public abstract Shirt createShirt(String sizeType, String style, boolean isFullHand, String color);

}
