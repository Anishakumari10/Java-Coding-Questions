package com.features;

public sealed interface department permits Salary {

	public String getDepartmentname();

	default String getEmployeeName() {
		return "Anisha";
	}

	default String getEmployeeDept() {
		return "IT";

	}

}
