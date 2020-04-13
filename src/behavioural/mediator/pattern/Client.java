package behavioural.mediator.pattern;

public class Client {

	public static void main(String a[]) {

		SocialMediaMediator mediator = new SocialMediaMediator();

		Facebook fb = new Facebook(mediator);
		Twitter twitter = new Twitter(mediator);
		Blog blog = new Blog(mediator);

		mediator.register(fb);
		mediator.register(twitter);
		mediator.register(blog);

		fb.post("Celebrated my birthday today with family and friends!");

		twitter.post("Finished reading the book - The Art of Negotiation. Here is my review ...(link)");

		blog.post(
				"The Writers Story : It was a lazy Sunday afternoon. The sun was hot and the writer took a walk down the street");

	}

}
