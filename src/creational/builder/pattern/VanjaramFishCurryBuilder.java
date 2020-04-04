package creational.builder.pattern;

public class VanjaramFishCurryBuilder implements FishCurryBuilder {

	FishCurry fishCurry = new FishCurry();

	@Override
	public FishCurryBuilder cutFish(int noOfPieces) {
		System.out.println("Cutting fish into " + noOfPieces + " pieces");

		fishCurry.setNoOfPieces(noOfPieces);
		
		return this;

	}

	@Override
	public FishCurry serveFish() {

		return fishCurry;

	}

	@Override
	public FishCurryBuilder addFish(String fishName) {

		System.out.println("Adding " + fishName + " to cooking vessel");
		fishCurry.setFishName(fishName);
		return this;
	}

	@Override
	public FishCurryBuilder designRecipe(String recipe) {
		System.out.println("Using recipe :" + recipe);

		fishCurry.setRecipe(recipe);
		return this;
	}

	@Override
	public FishCurryBuilder cookForDuration(String duration) {

		System.out.println("Cooking for " + duration);
		fishCurry.setCookingTime(duration);
		
		return this;

	}

	@Override
	public FishCurryBuilder prepareNoOfServes(int noOfServes) {
		System.out.println("Now that it is cooked , the number of serves is" + noOfServes);
		fishCurry.setNoOfServes(noOfServes);
		return this;
	}

}
