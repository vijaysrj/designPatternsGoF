package creational.builder.pattern;

public interface FishCurryBuilder {
	
	
	
	
	
	
	FishCurryBuilder cutFish(int noOfPieces);
	
	FishCurryBuilder addFish(String fishName);
	
	FishCurryBuilder designRecipe(String recipe);
	
	FishCurryBuilder cookForDuration(String duration);
	
	FishCurryBuilder prepareNoOfServes(int noOfServes);
	
	
	FishCurry serveFish();
	
	
	
	

}
