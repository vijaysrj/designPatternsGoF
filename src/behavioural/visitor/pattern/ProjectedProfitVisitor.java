package behavioural.visitor.pattern;

public class ProjectedProfitVisitor implements Visitor {

	double projectedBookSales = .8; // 80 percent

	double projectedShirtSales = .9; // 90 percent

	double projectedPhoneSales = .75; // 75 percent

	public int visit(Book book) {

		int bookQuantity = (int) (book.getQuantity() * projectedBookSales);

		int totalSellingPrice = (int) ((book.getSellingPrice() - 0.4 * book.getSellingPrice()) * bookQuantity);

		int totalPurchasePrice = book.getOriginalPrice() * bookQuantity;

		int profit = totalSellingPrice - totalPurchasePrice;

		System.out.println();

		System.out.println("Calculating projected profit for books ");

		System.out.println("Projected sales:" + projectedBookSales * 100 + "%");

		System.out.println("Total books expected to be sold" + bookQuantity);

		System.out.println("40 percent discount selected");

		System.out.println("Total purchase price" + totalPurchasePrice);

		System.out.println("Total sales price" + totalSellingPrice);

		System.out.println("Projected Profit" + profit);

		return profit;

	}

	public int visit(Phone phone) {

		int phoneQuantity = (int) (phone.getQuantity() * projectedPhoneSales);
		int totalSellingPrice = (int) ((phone.getSellingPrice() - 0.2 * phone.getSellingPrice()) * phoneQuantity);

		int totalPurchasePrice = phone.getOriginalPrice() * phoneQuantity;

		int profit = totalSellingPrice - totalPurchasePrice;

		System.out.println();

		System.out.println("Calculating projected profit for phones ");

		System.out.println("Projected sales:" + projectedPhoneSales * 100 + "%");

		System.out.println("Total phones expected to be sold" + phoneQuantity);

		System.out.println("20 percent discount selected");

		System.out.println("Total purchase price" + totalPurchasePrice);

		System.out.println("Total sales price" + totalSellingPrice);

		System.out.println("Projected Profit" + profit);

		return profit;

	}

	public int visit(Shirt shirt) {

		int shirtQuantity = (int) (shirt.getQuantity() * projectedShirtSales);

		int totalSellingPrice = (int) ((shirt.getSellingPrice() - 0.5 * shirt.getSellingPrice()) * shirtQuantity);

		int totalPurchasePrice = shirt.getOriginalPrice() * shirtQuantity;

		int profit = totalSellingPrice - totalPurchasePrice;

		System.out.println();

		System.out.println("Calculating projected profit for shirts ");

		System.out.println("Projected sales:" + projectedShirtSales * 100 + "%");

		System.out.println("Total shirts expected to be sold" + shirtQuantity);

		System.out.println("50 percent discount selected");

		System.out.println("Total purchase price" + totalPurchasePrice);

		System.out.println("Total sales price" + totalSellingPrice);

		System.out.println("Projected Profit" + profit);

		return profit;

	}
}
