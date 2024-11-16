package com.features;

import java.util.Objects;

public sealed class Employee permits EmployeeDetails{

	Employee() {
		super();
	}

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void getEmployeeName() {
		System.out.println("Name");
	}
	
	public void getEmployeeId() {
		System.out.println("Id");
	}
	
	public static void something() {
		System.out.println("something!");
	}

}
