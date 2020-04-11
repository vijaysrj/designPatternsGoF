package structural.flyweight.pattern;

public class Color {

	String name;
	
	
	public Color(String name) {
		
		this.name = name;
	}


	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}
	
	
}
