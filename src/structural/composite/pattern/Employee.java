package structural.composite.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

	protected long costToCompany;

	protected String name;

	protected List<Employee> employees = new ArrayList<Employee>();


	public String getName() {
		
		return this.name;
	}
	
	void add(Employee employee) throws Exception {

		throw new UnsupportedOperationException("Only team can add an employee");
	}

	void remove(Employee employee) throws Exception {

		throw new UnsupportedOperationException("Only team can remove an employee");
	}

	abstract long getCostToCompany();

}
