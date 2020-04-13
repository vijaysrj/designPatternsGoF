package behavioural.mediator.pattern;

public class Twitter implements SocialMedia {

	SocialMediaMediator mediator;
	
	public Twitter(SocialMediaMediator mediator) {
		
		
		this.mediator = mediator;
	}

	@Override
	public void post(String text) {
		
		System.out.println("Posting on Twitter: "+ text);
		System.out.println();
		
		this.mediator.notifyMediator(this, text);
	}

	@Override
	public void postFromOtherMedia(String className, String text) {
		
		System.out.println();
		System.out.println("Twitter feed updated through "+className);
		System.out.println("Post is :"+text);
		System.out.println();
		
	}
}
