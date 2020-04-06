package creational.abstractfactory.pattern;

public abstract class Shirt {
	
	String sizeType;
	
	String style;
	
	boolean isFullHand;
	
	String color;
	


	void setSizeType(String sizeType) {
		
		this.sizeType = sizeType;
		
	}
	
	void setStyle(String style) {
		
		this.style = style;
	}
	
	void isFullHand(boolean isFullHand) {
		
		this.isFullHand = isFullHand;
	}
	
	void setColor(String color) {
		
		this.color = color;
	}


	@Override
	public String toString() {
		return "Shirt [sizeType=" + sizeType + ", style=" + style + ", isFullHand=" + isFullHand + ", color=" + color
				+ "]";
	}
	
	
}
