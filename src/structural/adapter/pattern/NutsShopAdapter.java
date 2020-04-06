package structural.adapter.pattern;

public class NutsShopAdapter implements Shop {

	SachinNutsShop sachinNutsShop;

	public NutsShopAdapter(SachinNutsShop sachinNutsShop) {

		this.sachinNutsShop = sachinNutsShop;
	}

	@Override
	public Nuts orderNuts(String name, String quantity) {

		SachinNuts sachinNuts = sachinNutsShop.buyNuts(name, quantity);

		Nuts nuts = new NutsAdapter(sachinNuts);

		return nuts;

	}

}
