package structural.adapter.pattern;

public class Nuts {
	
	
	String name;
	
	String quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Nuts [name=" + name + ", quantity=" + quantity + "]";
	}
	
	

}
