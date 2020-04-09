package structural.decorator.pattern;

public class RoomDecorator extends HouseDecorator {

	
	

	public RoomDecorator(House house) {

		super(house);
	}
	
	public void design() {
		
		this.house.design();
		addRoom();
	}
	
	private void addRoom(){
		
		System.out.println("Adding a room");
	}
}
