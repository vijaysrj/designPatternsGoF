package creational.prototype.pattern;

import java.util.HashMap;
import java.util.Map;

public class ArtistRegistry {

	
	Map<String,Artist> artistRegistry = new HashMap<String,Artist>();
	
	
	
	ArtistRegistry(){
		
		loadInitialRegistry();
	}

	
	Artist getPrototype(String type) {
		
		Artist cloneArtist = null;
		
		try {
			cloneArtist = (Artist)artistRegistry.get(type).clone();
		}catch(CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return cloneArtist;
		
	}

	
	public void addPrototype(Artist artist, String type) {
		
		artistRegistry.put(type, artist);
	}

	private void loadInitialRegistry() {
		
		
		Artist maleanchor = new Artist();
		maleanchor.setGender("Male");
		maleanchor.setField("anchoring");
		
		artistRegistry.put("maleAnchor", maleanchor);
		
		Artist femaleModel = new Artist();
		femaleModel.setGender("Female");
		femaleModel.setExperience(0);
		
		artistRegistry.put("femaleModelNoExperience", femaleModel);
		
		
	}
}
