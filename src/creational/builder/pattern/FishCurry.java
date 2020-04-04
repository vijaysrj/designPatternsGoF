package creational.builder.pattern;

public class FishCurry {
	
	
	int noOfPieces;
	
	String fishName;
	
	String recipe;
	
	String cookingTime;
	
	int noOfServes;

	public int getNoOfPieces() {
		return noOfPieces;
	}

	public void setNoOfPieces(int noOfPieces) {
		this.noOfPieces = noOfPieces;
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(String cookingTime) {
		this.cookingTime = cookingTime;
	}

	public int getNoOfServes() {
		return noOfServes;
	}

	public void setNoOfServes(int noOfServes) {
		this.noOfServes = noOfServes;
	}

	@Override
	public String toString() {
		return "FishCurry [noOfPieces=" + noOfPieces + ", fishName=" + fishName + ", recipe=" + recipe
				+ ", cookingTime=" + cookingTime + ", noOfServes=" + noOfServes + "]";
	}
	
	

}
