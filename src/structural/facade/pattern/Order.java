package structural.facade.pattern;

import java.util.Arrays;

public class Order {
	
	private String orderId;

	//items stored in sequence
	private String[] items;
	
	//quantity of each item as stored in items[] array.
	private int[] quantity;
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public int[] getQuantity() {
		return quantity;
	}

	public void setQuantity(int[] quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", items=" + Arrays.toString(items) + ", quantity="
				+ Arrays.toString(quantity)  +"]";
	}
	
	

}
