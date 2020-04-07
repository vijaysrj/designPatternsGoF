package structural.bridge.pattern;

public abstract class Programmer {
	
	BackendProgrammer backend;
	
	Programmer(BackendProgrammer backend){
		
		
		this.backend = backend;
	}

	abstract void writeUICode();
	
	 void writeServiceCode() {
		
		this.backend.writeService();
	}
	
	public void developApplication() {
		
		System.out.println("Application Development Starts");
		
		writeUICode();
		writeServiceCode();
		
		System.out.println();
	}
}
