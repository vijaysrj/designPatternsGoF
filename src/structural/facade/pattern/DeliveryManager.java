package structural.facade.pattern;

public class DeliveryManager {
	
	public void deliverItems(Order order) {
		
		System.out.println("Delivering items for the order :"+order.getOrderId());
	}

}
