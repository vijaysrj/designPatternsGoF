package structural.bridge.pattern;

public class ReactProgrammer extends Programmer {

	ReactProgrammer(BackendProgrammer backend) {
		super(backend);

	}

	@Override
	public void writeUICode() {

		System.out.println("Writing UI code in React JS");

	}

	
}
