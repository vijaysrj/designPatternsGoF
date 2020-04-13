package behavioural.mediator.pattern;

public class Blog implements SocialMedia {

	SocialMediaMediator mediator;

	public Blog(SocialMediaMediator mediator) {

		this.mediator = mediator;
	}

	@Override
	public void post(String text) {

		System.out.println("Posting on Blog : " + text);
		System.out.println();

		this.mediator.notifyMediator(this, text);

	}

	@Override
	public void postFromOtherMedia(String className, String text) {
		
		System.out.println();
		System.out.println("Blog feed updated through "+className);
		System.out.println("Post is :"+text);
		System.out.println();
		
	}
}
