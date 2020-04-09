package structural.decorator.pattern;

public class Client {

	public static void main(String a[]) {

		House myhouse = new BalconyDecorator(new KitchenDecorator(new RoomDecorator(new ApartmentHouse())));

		myhouse.design();

		
		System.out.println("New Design");
		
		
		House myhouseAltered = new RoomDecorator(
				new BalconyDecorator(new KitchenDecorator(new RoomDecorator(new ApartmentHouse()))));

		myhouseAltered.design();
	}

}
