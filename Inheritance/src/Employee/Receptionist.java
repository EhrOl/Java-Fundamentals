package Employee;

public class Receptionist extends Employee {

	int age;
	double bonus;
	
	public Receptionist(String name, double salary, int age) {
		super(name,salary);
		this.age = age;
	}
	
	public double bonus() {
		bonus = employeeBonusBase + age*30;
		return bonus;
	}
	
}
