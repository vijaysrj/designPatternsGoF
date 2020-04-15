package behavioural.observer.pattern;

public class WhatsAppFollower implements Follower {

	private String name;

	private Blog blog;

	public WhatsAppFollower(Blog blog) {

		this.blog = blog;
	}

	public String getName() {
		return name;
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
		WhatsAppFollower other = (WhatsAppFollower) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public void update() {

		System.out.println();
		System.out.println("Update received by WhatsApp follower: " + this.name);
		System.out.println("New Article posted by The Full Stack Developer:");
		System.out.println(this.blog.getArticle());

	}

	@Override
	public void setName(String name) {

		this.name = name;

	}

}
