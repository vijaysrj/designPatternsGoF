package structural.adapter.pattern;

public class NutsAdapter extends Nuts {

	SachinNuts sachinNuts;

	public NutsAdapter(SachinNuts sachinNuts) {

		this.sachinNuts = sachinNuts;
	}

	@Override
	public String getName() {

		return sachinNuts.getNutsName();
	}

	@Override
	public String getQuantity() {
		return sachinNuts.getQuantityInGrams();
	}

	@Override
	public String toString() {

		return "Name=" + sachinNuts.getNutsName() + "-Quantity: " + sachinNuts.getQuantityInGrams();
	}

}
