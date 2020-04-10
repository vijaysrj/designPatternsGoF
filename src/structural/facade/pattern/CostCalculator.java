package structural.facade.pattern;

public class CostCalculator {

	
	public void calculateCost(Order order) {
		
		System.out.println("Calculating cost for order :"+order.getOrderId());
	}
}
