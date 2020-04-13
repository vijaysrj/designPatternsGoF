package behavioural.mediator.pattern;

public class Facebook implements SocialMedia {

	SocialMediaMediator mediator;

	public Facebook(SocialMediaMediator mediator) {

		this.mediator = mediator;
	}

	@Override
	public void post(String text) {

		System.out.println("Posting on Facebook : " + text);

		this.mediator.notifyMediator(this, text);
	}

	@Override
	public void postFromOtherMedia(String className, String text) {

		System.out.println();
		System.out.println("Facebook feed updated through " + className);
		System.out.println("Post is :" + text);
		System.out.println();

	}

}
