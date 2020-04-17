package behavioural.visitor.pattern;

public class Phone implements Item {

	private String name;

	private int quantity;

	private int sellingPrice;

	private int originalPrice;

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

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", quantity=" + quantity + ", sellingPrice=" + sellingPrice + ", originalPrice="
				+ originalPrice + "]";
	}

}
