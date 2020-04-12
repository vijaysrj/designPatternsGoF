package behavioural.command.pattern;

public class Developer {

	private String name;

	public Developer(String name) {

		this.name = name;

	}

	public void developCode() {

		System.out.println("Developer " + name + " writing code");
	}

}
