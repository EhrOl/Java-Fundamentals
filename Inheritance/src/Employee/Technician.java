package Employee;

public class Technician extends Employee {

	int numberOfServerCrashes = 0;
	
	public Technician(String name, double salary) {
		super(name, salary);
	}
	
	public double bonus() {
		double bonus = employeeBonusBase - numberOfServerCrashes;
		return bonus;
	}
	
	public void anotherServerCrash() {
		numberOfServerCrashes+=1;
	}
	
}
