package structural.composite.pattern;

public class EmployeeTeam extends Employee {

	public EmployeeTeam(String name) {

		this.name = name;
	}

	@Override
	void add(Employee employee) {

		this.employees.add(employee);
	}

	@Override
	void remove(Employee employee) {

		this.employees.remove(employee);
	}

	@Override
	long getCostToCompany() {

		long cost = 0;

		if (this.employees != null) {
			for (Employee e : this.employees) {

				if (e instanceof IndividualEmployee ind) {
					System.out.println("Cost to Company of " + ind.getName());
					System.out.println(ind.getCostToCompany());

				}

				cost += e.getCostToCompany();
			}
		}
		return cost;
	}

}
