package structural.facade.pattern;

public class OrderPacker {
	
	
	public void packItems(Order order) {
		
		System.out.println("Packing items for order: "+order.getOrderId());
	}

}
