package behavioural.strategy.pattern;

import java.util.List;

public class DroughtSalesStrategy implements SalesStrategy {

	@Override
	public void sellItems(List<Item> items) {

		System.out.println("Applying Drought Sales Strategy - Add 20% more to the cost");
		for (Item item : items) {

			int newPrice = (int) (item.getPrice() + (item.getPrice() * .2));

			System.out.println("Selling item :" + item.getName() + " for Rs." + newPrice);

		}

	}

}
