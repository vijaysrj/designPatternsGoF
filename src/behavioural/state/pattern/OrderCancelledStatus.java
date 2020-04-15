package behavioural.state.pattern;

public class OrderCancelledStatus implements DeliveryStatus {

	private ECommerceStore store;

	public OrderCancelledStatus(ECommerceStore store) {

		this.store = store;
	}

	@Override
	public void enquireStatus() {

		System.out.println("Order Cancelled.");

	}

	@Override
	public void updateStatus() {

		System.out.println("Delivery status cannot be updated as order is already cancelled");

	}

	@Override
	public void cancelOrder() {

		System.out.println("Order Cancelled");

	}

}
