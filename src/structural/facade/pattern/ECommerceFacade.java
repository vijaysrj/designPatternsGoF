package structural.facade.pattern;

public class ECommerceFacade {

	
	public void orderItems(Order order) {
		
		
		CartManager cartManager = new CartManager();
		cartManager.addToCart(order);
		
		CostCalculator costCalculator = new CostCalculator();
		costCalculator.calculateCost(order);
		
		MoneyManager moneyManager = new MoneyManager();
		moneyManager.debitMoney(order);
		
		OrderPacker packer = new OrderPacker();
		packer.packItems(order);
		
		DeliveryManager deliveryManager = new DeliveryManager();
		deliveryManager.deliverItems(order);
		
	}
}
