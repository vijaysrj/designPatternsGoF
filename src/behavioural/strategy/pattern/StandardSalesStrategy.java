package behavioural.strategy.pattern;

import java.util.List;

public class StandardSalesStrategy implements SalesStrategy {

	@Override
	public void sellItems(List<Item> items) {

		System.out.println("Applying Standard Sales Strategy - Sell at the same price quoted");
		for (Item item : items) {

			System.out.println("Selling item :" + item.getName() + " for Rs." + item.getPrice());

		}

	}

}
