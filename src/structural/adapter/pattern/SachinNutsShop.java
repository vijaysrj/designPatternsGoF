package structural.adapter.pattern;

public class SachinNutsShop {
	
	
	SachinNuts buyNuts(String nutsName,String quantity) {
		
		
		SachinNuts nuts = new SachinNuts();
		nuts.setNutsName(nutsName);

		nuts.setQuantityInGrams(quantity);
		
		return nuts;
	}

}
