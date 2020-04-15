package behavioural.state.pattern;

public class ItemsShippedStatus implements DeliveryStatus {
	
	
	private ECommerceStore store;
	
	public ItemsShippedStatus(ECommerceStore store) {
		
		this.store = store;
	}

	@Override
	public void enquireStatus() {

		System.out.println("Items Shipped , Please wait for transit");

	}

	@Override
	public void updateStatus() {
		
		this.store.setStatus(new InTransitStatus(this.store));

	}

	@Override
	public void cancelOrder() {
		
		System.out.println("Order cannot be cancelled as items are shipped");
		
		
		
	}

}
