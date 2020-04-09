package structural.decorator.pattern;

public class BalconyDecorator extends HouseDecorator {

	public BalconyDecorator(House house) {
		
		super(house);
	}
	
	public void design() {
		
		this.house.design();
		addBalcony();
	}
	
	private void addBalcony() {
		
		System.out.println("Adding balcony");
	}
}
