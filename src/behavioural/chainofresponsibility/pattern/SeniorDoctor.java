package behavioural.chainofresponsibility.pattern;

public class SeniorDoctor implements Doctor {
	
	private Doctor successor;
	
	public SeniorDoctor(Doctor doctor) {
		
		this.successor = doctor;
	}

	@Override
	public void checkPatient(String name,String symptoms) {
		
		String severity = checkSeverity(symptoms);
		
		
		if(severity.contentEquals("high")) {
			
			
			System.out.println("Patient treated by Senior Doctor ");
		}else {
			
			System.out.println("Severity more than high -> directing it to next doctor");
			
			this.successor.checkPatient(name,symptoms);
		}
		
		

	}

	@Override
	public String checkSeverity(String symptoms) {
		System.out.println("Patient being checked by Senior Doctor");
		
		if(symptoms.equals("breathing difficulty")|| symptoms.contentEquals("severe bodyache")) {
			
			return "high";
		}else {
		return "critical";
		}
	}

}
