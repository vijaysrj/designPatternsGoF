package structural.bridge.pattern;

public class Client {

	public static void main(String a[]) {
		
		Programmer programmer = new AngularProgrammer(new JavaProgrammer());

		programmer.developApplication();
		
		
		Programmer nextProgrammer = new ReactProgrammer(new DotNetProgrammer());
		
		nextProgrammer.developApplication();
		
		
		Programmer thirdProgrammer = new VueJSProgrammer(new NodeJSProgrammer());
		
		thirdProgrammer.developApplication();
		
		
		Programmer fourthProgrammer = new AngularProgrammer(new NodeJSProgrammer());
		
		fourthProgrammer.developApplication();
	}

}
