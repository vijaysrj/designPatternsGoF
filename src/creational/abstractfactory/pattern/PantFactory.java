package creational.abstractfactory.pattern;

public interface PantFactory {

	
	public Pant createPant(String sizeType, String style, boolean isHalfPant, String color);
}
