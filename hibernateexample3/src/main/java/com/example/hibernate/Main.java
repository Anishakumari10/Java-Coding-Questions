package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.model.Address;
import com.example.hibernate.model.Employee;
import com.example.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// Create new Employee
		Employee employee = new Employee();
		employee.setName("Shreenath");

		// Create new Address
		Address address = new Address();
		address.setStreet("123 Main St");

		// Set address's employee
		address.setEmployee(employee);

		// Save employee and address
		saveEmployee(employee, address);

		// Fetch and display employee and address
		Employee fetchedEmployee = getEmployeeById(employee.getId());
		if (fetchedEmployee != null) {
			System.out.println("Employee: " + fetchedEmployee.getName());

			// Open a new session to access the lazily-loaded collection
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				session.beginTransaction();
				fetchedEmployee = session.get(Employee.class, fetchedEmployee.getId());
				for (Address addr : fetchedEmployee.getAddresses()) {
					System.out.println("Address: " + addr.getStreet());
				}
				session.getTransaction().commit();
			}
		}

		// Shutdown Hibernate
		HibernateUtil.shutdown();
	}

	public static void saveEmployee(Employee employee, Address address) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// Start transaction
			transaction = session.beginTransaction();
			// Save the employee (which will also save the address because of cascade)
			session.save(employee);
			// Save the address
			session.save(address);
			// Commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public static Employee getEmployeeById(Long id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Employee.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}