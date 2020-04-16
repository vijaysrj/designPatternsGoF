package behavioural.memento.pattern;

public class MementoOriginator {

	public ShirtDesignMemento createMemento(ShirtDesign shirtDesign) {

		ShirtDesignMemento memento = new ShirtDesignMemento();
		memento.setColor(shirtDesign.getColor());
		memento.setSize(shirtDesign.getSize());
		memento.setStyle(shirtDesign.getStyle());
		return memento;
	}

	public ShirtDesign getShirtDesign(ShirtDesignMemento memento) {

		ShirtDesign shirtDesign = new ShirtDesign();
		shirtDesign.setColor(memento.getColor());

		shirtDesign.setSize(memento.getSize());
		shirtDesign.setStyle(memento.getStyle());

		return shirtDesign;
	}

}
