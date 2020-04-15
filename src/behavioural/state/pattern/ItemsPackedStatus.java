package behavioural.state.pattern;

public class ItemsPackedStatus implements DeliveryStatus {
	
	private ECommerceStore store;

	public ItemsPackedStatus(ECommerceStore store) {

		this.store = store;
	}

	@Override
	public void enquireStatus() {
		
		System.out.println("Items are packed , Please wait for it to get shipped");

	}

	@Override
	public void updateStatus() {

		this.store.setStatus(new ItemsShippedStatus(this.store));
	}

	@Override
	public void cancelOrder() {
		
		
		this.store.setStatus(new OrderCancelledStatus(this.store));
		
	}

}
