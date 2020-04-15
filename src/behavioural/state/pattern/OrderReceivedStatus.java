package behavioural.state.pattern;

public class OrderReceivedStatus implements DeliveryStatus {

	private ECommerceStore store;

	public OrderReceivedStatus(ECommerceStore store) {

		this.store = store;
	}

	@Override
	public void enquireStatus() {

		System.out.println("Order Received , Please wait for items to get packed");

	}

	@Override
	public void updateStatus() {

		this.store.setStatus(new ItemsPackedStatus(this.store));

	}

	@Override
	public void cancelOrder() {

		this.store.setStatus(new OrderCancelledStatus(this.store));

	}

}
