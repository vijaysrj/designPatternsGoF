package structural.adapter.pattern;

public class RaghavNutsShop implements Shop{

	@Override
	public Nuts orderNuts(String name, String quantity) {
		
		System.out.println("Sorry we are closed");
		return null;
	}

}
