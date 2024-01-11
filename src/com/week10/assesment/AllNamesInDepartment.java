package com.week10.assesment;

import java.util.List;
import java.util.stream.Collectors;

public class AllNamesInDepartment {

	public static void main(String[] args) {
		List<Employee> employeeList = ListEmployee.list();
		 List v=employeeList.stream().map(Employee::getName).collect(Collectors.toList());
	System.out.println(v);
	}

}
