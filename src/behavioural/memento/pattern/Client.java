package behavioural.memento.pattern;

public class Client {

	public static void main(String a[]) {

		ShirtDesign shirtDesign = new ShirtDesign();
		shirtDesign.setColor("blue");
		shirtDesign.setSize("Medium");
		shirtDesign.setStyle("Contemporary");

		System.out.println(shirtDesign);

		MementoOriginator originator = new MementoOriginator();
		ShirtDesignMemento memento = originator.createMemento(shirtDesign);

		MementoCareTaker careTaker = new MementoCareTaker();
		careTaker.pushMemento(memento);

		System.out.println("Changing design..");
		shirtDesign.setColor("yellow");
		shirtDesign.setSize("Large");

		System.out.println("New Design:" + shirtDesign);

		System.out.println("Retrieving back design");

		shirtDesign = originator.getShirtDesign(careTaker.popMemento());

		System.out.println("Original design: " + shirtDesign);

	}

}
