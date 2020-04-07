package structural.bridge.pattern;

public class AngularProgrammer extends Programmer {

	AngularProgrammer(BackendProgrammer backend) {
		super(backend);

	}

	@Override
	public void writeUICode() {

		System.out.println("Writing UI code in Angular");

	}

	
}
