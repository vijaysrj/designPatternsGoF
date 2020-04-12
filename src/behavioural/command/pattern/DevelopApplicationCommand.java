package behavioural.command.pattern;

public class DevelopApplicationCommand implements Command {

	private Developer developer;

	public DevelopApplicationCommand(Developer developer) {

		this.developer = developer;
	}

	@Override
	public void execute() {

		this.developer.developCode();
	}

}
