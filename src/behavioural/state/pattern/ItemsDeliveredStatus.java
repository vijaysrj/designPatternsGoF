package behavioural.state.pattern;

public class ItemsDeliveredStatus implements DeliveryStatus {

	private ECommerceStore store;

	public ItemsDeliveredStatus(ECommerceStore store) {

		this.store = store;
	}

	@Override
	public void enquireStatus() {

		System.out.println("Items Delivered to Customer.");

	}

	@Override
	public void updateStatus() {

		System.out.println("Items already in delivered status");

	}

	@Override
	public void cancelOrder() {

		System.out.println("You cannot cancel the order as it is already delivered");

	}

}
