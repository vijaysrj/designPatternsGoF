package behavioural.visitor.pattern;

public class Book implements Item {

	private String name;

	private int quantity;

	private int originalPrice;

	private int sellingPrice;

	@Override
	public int accept(Visitor visitor) {

		return visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", quantity=" + quantity + ", originalPrice=" + originalPrice + ", sellingPrice="
				+ sellingPrice + "]";
	}

}
