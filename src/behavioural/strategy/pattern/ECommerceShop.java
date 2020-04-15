package behavioural.strategy.pattern;

import java.util.List;

public class ECommerceShop {

	private SalesStrategy salesStrategy;

	public void setSellingStrategy(SalesStrategy salesStrategy) {

		this.salesStrategy = salesStrategy;

	}

	public void sellItems(List<Item> items) {

		this.salesStrategy.sellItems(items);

	}

}
