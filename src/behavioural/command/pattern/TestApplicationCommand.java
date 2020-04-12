package behavioural.command.pattern;

public class TestApplicationCommand implements Command {

	private Tester tester;

	public TestApplicationCommand(Tester tester) {

		this.tester = tester;
	}

	@Override
	public void execute() {

		this.tester.testApplication();

	}

}
