package Employee;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> empl = new ArrayList<>();
		Technician t = new Technician("Carl", 10000);
		Receptionist r = new Receptionist("Linda", 10000, 30);
		Programmer p = new Programmer("Mats", 12000);
		empl.add(t);
		empl.add(r);
		empl.add(p);

		double totalBonus = CalculateBonus.sumBonus(empl);
		System.out.println(totalBonus);
	}
}
