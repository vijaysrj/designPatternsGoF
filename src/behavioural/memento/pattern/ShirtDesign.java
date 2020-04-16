package behavioural.memento.pattern;

public class ShirtDesign {

	private String color;

	private String size;

	private String style;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "ShirtDesign [color=" + color + ", size=" + size + ", style=" + style + "]";
	}

}
