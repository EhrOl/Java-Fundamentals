package Employee;

import java.util.ArrayList;

public class CalculateBonus {

	public static double sumBonus(ArrayList<Employee> emp) {
		double totBonus = 0;
		for (Employee currentEmployee : emp) {
			totBonus += currentEmployee.bonus();
//			if (currentEmployee instanceof Technician) {
//				totBonus += ((Technician) currentEmployee).bonus();
//			} else if (currentEmployee instanceof Receptionist) {
//				totBonus += ((Receptionist) currentEmployee).bonus();
//			} else if (currentEmployee instanceof Programmer) {
//				totBonus += ((Programmer) currentEmployee).bonus();
//			}
		}
		return totBonus;
	}
}
