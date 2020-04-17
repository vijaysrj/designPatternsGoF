package behavioural.visitor.pattern;

public interface Item {
	
	int getSellingPrice();
	
	int getOriginalPrice();
	
	int getQuantity();
	
	String getName();

	int accept(Visitor visitor);

}
