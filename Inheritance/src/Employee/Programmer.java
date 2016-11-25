package Employee;

public class Programmer extends Employee {

	int numberOfApplications;

	public Programmer(String name, double salary) {
		super(name, salary);
	}
	
	public double bonus() {
		double bonus = employeeBonusBase * numberOfApplications;
		return bonus;
	}
	
	public void anotherApplication() {
		numberOfApplications+=1;
	}
	
	
}
