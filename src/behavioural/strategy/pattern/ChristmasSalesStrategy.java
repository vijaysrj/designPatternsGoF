package behavioural.strategy.pattern;

import java.util.List;

public class ChristmasSalesStrategy implements SalesStrategy {

	@Override
	public void sellItems(List<Item> items) {

		System.out.println("Applying Christmas Sales Strategy - 40% discount");
		for (Item item : items) {

			int newPrice = (int) (item.getPrice() - (item.getPrice() * .4));

			System.out.println("Selling item :" + item.getName() + " for Rs." + newPrice);

		}

	}

}
