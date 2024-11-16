import java.util.HashMap;
import java.util.Map;

class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

    
}

public class EmployeeManager {
    private Map<Integer, Employee> empMap = new HashMap<>();

    public Employee findEmployeeById(int id) {
        if (!empMap.containsKey(id)) {
            Employee e = findById(id);
            empMap.put(id, e);
        }
        return empMap.get(id);
    }

   
    private Employee findById(int id) {
        switch (id) {
            case 1:
                return new Employee(1, "John Doe", 50000.0);
            case 2:
                new Employee(2, "Alice Smith", 60000.0);
            case 3:
                new Employee(3, "Bob Johnson", 55000.0);
            default: ; // Employee not found
        }
		return null;
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        int idToFind = 2;
        Employee foundEmployee = manager.findEmployeeById(idToFind);
        Employee em = manager.findEmployeeById(2);

        if (foundEmployee != null && em != null) {
            System.out.println("Employee found: ID=" + foundEmployee.getEmpId() +
                    ", Name=" + foundEmployee.getName() +
                    ", Salary=" + foundEmployee.getSalary());
        } else {
            System.out.println("Employee with ID " + idToFind + " not found.");
        }
    }
}
