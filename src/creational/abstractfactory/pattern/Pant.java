package creational.abstractfactory.pattern;

public abstract class Pant {

	
	String style;
	
	String sizeType;
	
	String color;
	
	boolean isHalfPant;
	
	

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSizeType() {
		return sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHalfPant() {
		return isHalfPant;
	}

	public void setHalfPant(boolean isHalfPant) {
		this.isHalfPant = isHalfPant;
	}

	@Override
	public String toString() {
		return "Pant [style=" + style + ", sizeType=" + sizeType + ", color=" + color + ", isHalfPant=" + isHalfPant
				+ "]";
	}
	
	
}
