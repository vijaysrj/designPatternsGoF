package creational.builder.pattern;

public class Client {

	public static void main(String a[]) {

		

		FishCurryLover fishCurryLover = new FishCurryLover(); //Director

		FishCurryBuilder vanjaramFishCurryBuilder = 
				fishCurryLover.createFishCurry(new VanjaramFishCurryBuilder()); //Builder

		FishCurry fishcurry = vanjaramFishCurryBuilder.serveFish(); // Product
		
		
		System.out.println(fishcurry);
	}

}
