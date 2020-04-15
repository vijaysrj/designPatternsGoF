package behavioural.state.pattern;

public class ECommerceStore {

	private DeliveryStatus deliveryStatus;

	public void getOrder() {

		// intial status
		setStatus(new OrderReceivedStatus(this));

	}

	public void enquireStatus() {

		this.deliveryStatus.enquireStatus();

	}

	public void cancelOrder() {

		System.out.println("Cancelling Order...");
		this.deliveryStatus.cancelOrder();
	}

	public void updateStatus() {

		this.deliveryStatus.updateStatus();

	}

	public void setStatus(DeliveryStatus deliveryStatus) {

		this.deliveryStatus = deliveryStatus;

	}

}
