package behavioural.command.pattern;

public class Client {

	public static void main(String a[]) {
		
		
		DevelopApplicationCommand developCommand = new DevelopApplicationCommand(new Developer("Agathya"));
		
		TestApplicationCommand testCommand = new TestApplicationCommand(new Tester("Vimal"));
		
		
		Manager manager = new Manager();
		
		manager.giveCommandToTeam(developCommand);
		
		manager.giveCommandToTeam(testCommand);
		
		
	}
}
