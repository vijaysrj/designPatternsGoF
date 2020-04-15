package creational.singleton.pattern;

public class SuperStar {
	
	private static volatile SuperStar superStar = null;
	
	
	
	private SuperStar() {
		
	
		if(superStar != null) {
			
			throw new RuntimeException("There can be one and only one Super Star!");
		}
	}
	
	public static SuperStar getInstance() {
		
	
		if(superStar == null) {
			
			
			synchronized (SuperStar.class) {
				
				if(superStar == null) {
					
					superStar = new SuperStar();
				}
				
			}
		}
		
		return superStar;
	}

}
