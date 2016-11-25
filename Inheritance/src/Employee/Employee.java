package Employee;

public abstract class Employee {
	
	private String name;
	private double salary;
	protected final double employeeBonusBase;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.employeeBonusBase = 3000;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	abstract public double bonus();

}
