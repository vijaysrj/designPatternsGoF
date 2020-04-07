package structural.bridge.pattern;

public class VueJSProgrammer extends Programmer {

	VueJSProgrammer(BackendProgrammer backend) {
		super(backend);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeUICode() {

		System.out.println("Write UI code in Vue JS");

	}

}
