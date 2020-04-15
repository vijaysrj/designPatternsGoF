package behavioural.strategy.pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String a[]) {

		Item shirt = new Item("shirt");
		shirt.setPrice(2000);

		Item bag = new Item("bag");
		bag.setPrice(3000);

		List<Item> items = new ArrayList<Item>();
		items.add(shirt);
		items.add(bag);

		ECommerceShop shop = new ECommerceShop();

		shop.setSellingStrategy(new ChristmasSalesStrategy());

		shop.sellItems(items);

		shop.setSellingStrategy(new StandardSalesStrategy());
		shop.sellItems(items);

		shop.setSellingStrategy(new DroughtSalesStrategy());
		shop.sellItems(items);

	}
}
