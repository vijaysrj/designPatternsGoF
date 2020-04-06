package structural.adapter.pattern;

public class Client {

	public static void main(String a[]) {

		System.out.println("Ordering at Raghav Nuts Shop");
		
		Nuts nutsOriginal = orderNuts(new RaghavNutsShop());

		System.out.println(nutsOriginal);

		
		System.out.println("Ordering at Sachin Nuts Shop");
		
		Nuts nutsNew = orderNuts(new NutsShopAdapter(new SachinNutsShop()));

		System.out.println(nutsNew);

	}

	private static Nuts orderNuts(Shop shop) {

		return shop.orderNuts("Pista", "100");

	}

}
