package structural.decorator.pattern;

public class KitchenDecorator extends HouseDecorator {

	
	public KitchenDecorator(House house) {
		
		
		super(house);
	}
	
	public void design() {
		
		this.house.design();
		
		addKitchen();
	}
	
	private void addKitchen() {
		
		System.out.println("Adding a Kitchen");
	}
}
