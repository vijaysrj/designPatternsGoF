package structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {

	Map<String, Color> colorMap = new HashMap<String, Color>();

	public Color getColor(String name) {

		if (colorMap.get(name) != null) {

			System.out.println("Returning existing Color object for the color: "+name);

			return colorMap.get(name);
		} else {

			System.out.println("Creating new Color object for the color :"+name);

			Color color = new Color(name);
			colorMap.put(name, color);
			return color;
		}

	}
	
	
	public void printAllColors() {
		
		
		System.out.println("List of all colors in system");
		for(String key:colorMap.keySet()) {
			
			System.out.println(colorMap.get(key));
		}
	}

}
