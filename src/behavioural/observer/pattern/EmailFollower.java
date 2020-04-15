package behavioural.observer.pattern;

public class EmailFollower implements Follower {

	private String name;

	private Blog blog;

	public EmailFollower(Blog blog) {

		this.blog = blog;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	@Override
	public void update() {

		System.out.println();

		System.out.println("Update received by Email Follower: " + this.name);
		System.out.println("New Article posted by The Full Stack Developer:");
		System.out.println(this.blog.getArticle());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailFollower other = (EmailFollower) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
