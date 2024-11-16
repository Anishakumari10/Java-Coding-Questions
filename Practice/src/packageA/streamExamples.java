package packageA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamExamples {
	public static void main(String[] args) {
		
		
	
		Employee[] arrayOfEmps = {new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0) };
		List<Employee> empList = Arrays.asList(arrayOfEmps);

		System.out.println("USING COMPARABLE");
		Collections.sort(empList);
		for (Employee e : empList) {
			System.out.println(e);
		}

		System.out.println("USING COMPARATOR FOR SALARY!");
		Comparator<Employee> bySalary = Comparator.comparingDouble(Employee::getSalary);
		empList.sort(bySalary.reversed());
		for (Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("USING COMPARATOR FOR NAMES!");
		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		empList.sort(byName);
		for (Employee e : empList) {
			System.out.println(e);
		}

		System.out.println("AFTER STREAMS!");
		List<Employee> employees = empList.stream().sorted(bySalary.reversed()).collect(Collectors.toList());

		for (Employee e : employees) {
			System.out.println(e);
		}

	}
}