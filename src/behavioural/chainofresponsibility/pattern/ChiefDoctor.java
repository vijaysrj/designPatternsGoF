package behavioural.chainofresponsibility.pattern;

public class ChiefDoctor implements Doctor {

	private Doctor successor;

	public ChiefDoctor() {
		
		
	}
	public ChiefDoctor(Doctor doctor) {

		this.successor = doctor;
	}

	@Override
	public void checkPatient(String name, String symptoms) {

		String severity = checkSeverity(symptoms);

		if (severity.equals("critical")) {

			System.out.println("Chief Doctor treating patient :" + name);
			System.out.println("Patient condition is critical");
		} else {

			System.out.println("No doctor available to treat patient for the given symptoms");
		}

	}

	@Override
	public String checkSeverity(String symptoms) {

		System.out.println("Patient being checked by Chief Doctor");

		if (symptoms.equals("rapid heart beat") || symptoms.equals("fracture")) {
			return "critical";
		} else {

			return "uncategorized";
		}
	}

}
