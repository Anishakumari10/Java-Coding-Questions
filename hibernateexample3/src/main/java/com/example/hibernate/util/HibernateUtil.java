package com.example.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.example.hibernate.model.Address;
import com.example.hibernate.model.Employee;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		try {
			// Load configuration from hibernate.cfg.xml
			Configuration configuration = new Configuration().configure();
			// Add annotated classes
			configuration.addAnnotatedClass(Employee.class);
			configuration.addAnnotatedClass(Address.class);
			// Create ServiceRegistry
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			// Build SessionFactory
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("Initialization failed: " + e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
}