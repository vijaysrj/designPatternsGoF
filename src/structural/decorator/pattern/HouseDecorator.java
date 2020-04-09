package structural.decorator.pattern;

public abstract class HouseDecorator implements House {

	House house;

	public HouseDecorator(House house) {

		this.house = house;
	}

	@Override
	public void design() {

		this.house.design();

	}

}
