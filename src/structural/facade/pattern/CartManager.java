package structural.facade.pattern;

public class CartManager {

	
	public void addToCart(Order order) {
		
		System.out.println("Adding item to cart");
		System.out.println("Added item : "+order);
	}
}
