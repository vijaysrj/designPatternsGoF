package creational.prototype.pattern;

public class Client {

	public static void main(String a[]) {

		// Get a male artist who is an anchor
		ArtistRegistry registry = new ArtistRegistry();
		Artist artist = registry.getPrototype("maleAnchor");

		// Set his name
		artist.setName("Batista");

		// display the custom artist made , client just had to set the name!
		System.out.println(artist);

		// Another example
		// Let's create a new prototype from existing prototype and add it to registry

		Artist femaleArtist = registry.getPrototype("femaleModelNoExperience");
		femaleArtist.setField("cinema");

		// we have created a new prototype model who is female, has no experience and
		// tagged to cinema field
		// Now lets add this prototype to registry
		
		registry.addPrototype(femaleArtist, "femaleCinemaFresh");
		
		
		//Now lets get the prototype again and assign a name and age 
		
		Artist femaleCineArtist = registry.getPrototype("femaleCinemaFresh");
		
		femaleCineArtist.setAge(22);
		femaleCineArtist.setName("Rithika");
		
		System.out.println(femaleCineArtist);
		

	}
}
