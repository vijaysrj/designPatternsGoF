package structural.composite.pattern;

public class IndividualEmployee extends Employee {

	public IndividualEmployee(String name) {

		this.name = name;
	}

	@Override
	long getCostToCompany() {

		return this.costToCompany;
	}

	public void setCostToCompany(long cost) {

		this.costToCompany = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IndividualEmployee other = (IndividualEmployee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
