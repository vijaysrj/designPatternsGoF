package structural.flyweight.pattern;

public class Client {

	public static void main(String a[]) {

		ColorFactory colorFactory = new ColorFactory();
		
		Color blueColor = colorFactory.getColor("blue");

		Color greenColor = colorFactory.getColor("green");

		Color purpleColor = colorFactory.getColor("purple");
		
		
		createPalette(blueColor,greenColor,purpleColor);
		

		Color blueColor2 = colorFactory.getColor("blue");
		
		Color yellowColor = colorFactory.getColor("yellow");
		
		Color purpleColor2  = colorFactory.getColor("purple");
		
		createPalette(blueColor2, yellowColor, purpleColor2);
		
		

		colorFactory.printAllColors();
		
		
	}

	private static void createPalette(Color color1, Color color2, Color color3) {

		
		System.out.println("Preparing a new palette using the colors: ");
		System.out.println(color1+"-"+color2+"-"+color3);
	}

}
