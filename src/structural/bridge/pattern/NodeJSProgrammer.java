package structural.bridge.pattern;

public class NodeJSProgrammer implements BackendProgrammer {

	@Override
	public void writeService() {

		System.out.println("Writing service in NodeJS");
	}

}
