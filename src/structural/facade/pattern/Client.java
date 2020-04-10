package structural.facade.pattern;

public class Client {
	
	
	public static void main(String a[]) {
		
		Order order = new Order();
		order.setOrderId("1001");
		
		order.setItems(new String[] {"shoes","socks","bag"});
		
		order.setQuantity(new int[] {2,6,1});
		
		
		
		ECommerceFacade facade = new ECommerceFacade();
		facade.orderItems(order);
		
		
	}

}
