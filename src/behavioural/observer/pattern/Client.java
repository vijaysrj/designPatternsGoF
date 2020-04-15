package behavioural.observer.pattern;

public class Client {

	public static void main(String a[]) {

		Blog blog = new TheFullStackDeveloperBlog();

		Follower emailFollower1 = new EmailFollower(blog);
		emailFollower1.setName("The Code Addict");

		Follower emailFollower2 = new EmailFollower(blog);
		emailFollower2.setName("Full Stack Lovers");

		Follower whatsAppFollower = new WhatsAppFollower(blog);
		whatsAppFollower.setName("Tinkerer");

		blog.subscribe(emailFollower1);
		blog.subscribe(emailFollower2);
		blog.subscribe(whatsAppFollower);

		blog.postArticle("How to implement Observer Pattern in Java? .......");

		blog.unsubscribe(emailFollower2);

		blog.postArticle("How to implement Bridge Pattern in Java?....");

	}
}
