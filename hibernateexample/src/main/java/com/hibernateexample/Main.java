package com.hibernateexample;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateexample.model.Employee;
import com.hibernateexample.util.HibernateUtil;

public class Main {
	
	public static void main(String[] args) {
        // Create
        Employee employee = new Employee();
        employee.setName("anisha");
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
 
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
 
        // Read
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            Employee emp = session.get(Employee.class, employee.getId());
            System.out.println("Employee Name: " + emp.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
 
        // Update
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            employee.setName("anisha kumari");
            session.update(employee);
            transaction.commit();
            System.out.println("Successful");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
 
        // Delete
//        session = HibernateUtil.getSessionFactory().openSession();
//        try {
//            transaction = session.beginTransaction();
//            employee.setId(1);
//            session.delete(employee);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) transaction.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
// 
        // Shutdown
        HibernateUtil.shutdown();
    }
}

