package structural.facade.pattern;

public class MoneyManager {

	public void debitMoney(Order order) {
		
		
		System.out.println("Debiting money for order: "+order.getOrderId());
	}
}
