package behavioural.observer.pattern;

public interface Blog {

	void subscribe(Follower follower);

	void unsubscribe(Follower follower);

	void notifyFollowers();

	void postArticle(String string);

	String getArticle();

}
