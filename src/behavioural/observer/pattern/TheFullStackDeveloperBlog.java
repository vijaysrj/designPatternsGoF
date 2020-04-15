package behavioural.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class TheFullStackDeveloperBlog implements Blog {

	List<Follower> followers = new ArrayList<Follower>();

	private String article;

	@Override
	public void subscribe(Follower follower) {

		followers.add(follower);

	}

	@Override
	public void unsubscribe(Follower follower) {

		followers.remove(follower);
	}

	@Override
	public void notifyFollowers() {

		for (Follower follower : this.followers) {

			follower.update();
		}

	}

	@Override
	public void postArticle(String article) {

		this.article = article;

		notifyFollowers();

	}

	@Override
	public String getArticle() {
		return article;
	}

}
