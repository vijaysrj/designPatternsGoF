package behavioural.mediator.pattern;

public interface SocialMedia {

	public void post(String text);

	public void postFromOtherMedia(String className, String text);
}
