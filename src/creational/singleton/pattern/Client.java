package creational.singleton.pattern;

public class Client {
	
	
	public static void main(String a[]) {
		
		SuperStar superStar = SuperStar.getInstance();
		
		System.out.println(superStar);
		
		
		SuperStar secondSuperStar = SuperStar.getInstance();
		
		System.out.println(secondSuperStar);
		
		
		//Using Enum
		
		SuperStarEnum superStarEnum = SuperStarEnum.SUPER_STAR;
		
		superStarEnum.setName("Rajnikanth");
		
		System.out.println(superStarEnum);
		
		System.out.println(superStarEnum.getName());
	}

}
