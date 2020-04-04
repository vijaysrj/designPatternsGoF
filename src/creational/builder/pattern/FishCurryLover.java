package creational.builder.pattern;

public class FishCurryLover {

	public FishCurryBuilder createFishCurry(VanjaramFishCurryBuilder builder) {

		builder.cutFish(6)
				.addFish("Vanjaram")
				.designRecipe("Vanjaram Fish Recipe")
				.cookForDuration("30 minutes")
				.prepareNoOfServes(5);

		return builder;
	}

}