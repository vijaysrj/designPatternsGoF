package behavioural.chainofresponsibility.pattern;

public class Client {
	
	
	public static void main(String a[]) {
		
		
		ChiefDoctor chiefDoctor = new ChiefDoctor();
		SeniorDoctor seniorDoctor = new SeniorDoctor(chiefDoctor);
		JuniorDoctor juniorDoctor = new JuniorDoctor(seniorDoctor);
		
		
		System.out.println("---------Patient Kumar------------");
		
		juniorDoctor.checkPatient("Kumar", "severe bodyache");
		
		System.out.println("---------Patient Raghav------------");
		juniorDoctor.checkPatient("Raghav", "cold");
		
		System.out.println("---------Patient Varun------------");
		
		juniorDoctor.checkPatient("Varun", "fracture");
		
		
		
		
	}

}
