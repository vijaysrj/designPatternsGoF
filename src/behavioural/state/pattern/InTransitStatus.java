package behavioural.state.pattern;

public class InTransitStatus implements DeliveryStatus {

	private ECommerceStore store;

	public InTransitStatus(ECommerceStore store) {

		this.store = store;
	}

	@Override
	public void enquireStatus() {

		System.out.println("Items in Transit , please wait for delivery");

	}

	@Override
	public void updateStatus() {

		this.store.setStatus(new ItemsDeliveredStatus(this.store));

	}

	@Override
	public void cancelOrder() {

		System.out.println("You cannot cancel the order , it is already in transit status");

	}

}
