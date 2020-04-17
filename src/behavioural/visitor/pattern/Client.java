package behavioural.visitor.pattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String a[]) {

		Book book = new Book();
		book.setName("The History of Western Philosophy - Betrand Russell");
		book.setOriginalPrice(500);
		book.setSellingPrice(1000);
		book.setQuantity(40);

		Phone phone = new Phone();
		phone.setName("Iphone");
		phone.setOriginalPrice(40000);
		phone.setSellingPrice(65000);
		phone.setQuantity(50);

		Shirt shirt = new Shirt();
		shirt.setName("Polo Tshirt - Size XL");
		shirt.setOriginalPrice(200);
		shirt.setSellingPrice(500);
		shirt.setQuantity(100);

		List<Item> items = new ArrayList<Item>();
		items.add(book);
		items.add(phone);
		items.add(shirt);

		Visitor visitor = new ProjectedProfitVisitor();
		int projectedProfit = 0;

		for (Item item : items) {

			projectedProfit = projectedProfit + item.accept(visitor);
		}

		System.out.println("Projected profit after applying discount:" + projectedProfit);

	}
}
