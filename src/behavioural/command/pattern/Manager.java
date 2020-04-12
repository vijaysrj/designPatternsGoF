package behavioural.command.pattern;

public class Manager {

	public void giveCommandToTeam(Command command) {

		command.execute();
	}

}
