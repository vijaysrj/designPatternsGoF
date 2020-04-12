package behavioural.chainofresponsibility.pattern;

public interface Doctor {

	public abstract void checkPatient(String name,String symptoms);
	
	public abstract String checkSeverity(String symptoms);
}
