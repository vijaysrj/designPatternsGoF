package behavioural.state.pattern;

public class Client {

	public static void main(String a[]) {

		ECommerceStore store = new ECommerceStore();

		System.out.println("Scenario 1 - Place order and cancel it before it get shipped");

		store.getOrder();

		store.updateStatus();

		store.enquireStatus();

		store.cancelOrder();

		store.enquireStatus();

		System.out.println();

		System.out.println("Scenario 2 - Place order and cancel it while in transit");

		store.getOrder();

		store.enquireStatus();

		store.updateStatus();

		store.enquireStatus();

		store.updateStatus();

		store.enquireStatus();

		store.updateStatus();

		store.cancelOrder();

		store.enquireStatus();

		System.out.println();
		System.out.println("Scenario 3 - Place order and wait until it gets delivered");

		store.getOrder();
		store.updateStatus();
		store.updateStatus();
		store.updateStatus();
		store.updateStatus();
		store.enquireStatus();

	}
}
