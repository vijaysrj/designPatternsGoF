package behavioural.chainofresponsibility.pattern;

public class JuniorDoctor implements Doctor {

	private Doctor successor;

	public JuniorDoctor(Doctor doctor) {

		this.successor = doctor;
	}

	@Override
	public void checkPatient(String name, String symptoms) {

		String severity = checkSeverity(symptoms);

		if (severity.equals("low")) {

			System.out.println("Patient treated by Junior Doctor");
		} else {
			System.out.println("Severity not low -> directing it to next doctor");

			this.successor.checkPatient(name, symptoms);
		}

	}

	public String checkSeverity(String symptoms) {

		System.out.println("Patient being checked by Junior Doctor");

		if (symptoms.contains("fever") || symptoms.contains("cough") || symptoms.contains("cold")) {

			return "low";
		} else {
			return "high";
		}
	}

}
