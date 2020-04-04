package creational.prototype.pattern;

public class Artist implements Cloneable {

	public String name;

	public int age;

	public String gender;

	public String field;

	public int experience;

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Artist [name=" + name + ", age=" + age + ", gender=" + gender + ", field=" + field + ", experience="
				+ experience + "]";
	}

}
