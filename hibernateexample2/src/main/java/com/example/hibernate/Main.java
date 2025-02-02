package com.example.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.model.User;
import com.example.hibernate.util.HibernateUtil;

public class Main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("Choose an operation");
			System.out.println("1:create,2:read,3:update,4:delete,5:exit");
			System.out.println("Enter your choice");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				createUser();
				break;
			case 2:
				readUser();
				break;
			case 3:
				updateUser();
				break;
			case 4:
				deleteUser();
				break;
			case 5:
				exit = true;
				System.out.println("Thank you for using our application");
				HibernateUtil.shutdown();
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}// main

	public static void createUser() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = scanner.nextInt();
		user.setId(id);
		System.out.println("Enter name:");
		String name = scanner.next();
		user.setName(name);
		System.out.println("Enter email:");
		String email = scanner.next();
		user.setEmail(email);
		session.save(user);
		transaction.commit();
		System.out.println("Record saved to db successfully....");
	}

	public static void readUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = scanner.nextInt();
		User user = session.get(User.class, id);
		if (user != null) {
			System.out.println("Name:" + user.getName());
			System.out.println("Email" + user.getEmail());
		} else {
			System.out.println("User not found");
		}
	}

	public static void updateUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id:");
			int id = scanner.nextInt();
			User user = session.get(User.class, id);
			if (user != null) {
				System.out.println("Enter new name:");
				String name = scanner.nextLine();
				user.setName(name);
				session.update(user);
				transaction.commit();
				System.out.println("Updated successfully....");
			} else {
				System.out.println("invalid user");
			}
		} catch (Exception e) {
			System.out.println("caught"+e);
		}
	}

	public static void deleteUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter id:");
		int id = scanner.nextInt();
		User user = session.get(User.class, id);
		if (user != null) {
			session.delete(user);
			transaction.commit();
			System.out.println("deleted successfully....");
		} else {
			System.out.println("Invalid user");
		}
	}

}
