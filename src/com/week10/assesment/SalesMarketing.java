package com.week10.assesment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalesMarketing {

	public static void main(String[] args) {
		List<Employee> employeeList = ListEmployee.list();
		int male = (int) employeeList.stream().filter(e -> e.getGender() == "Male")
				.filter(e -> e.getDepartment() == "Sales" && e.getDepartment() == "Marketing").count();
		System.out.println(male + "==male");
		int female = (int) employeeList.stream().filter(e -> e.getGender() == "Female")
				.filter(e -> e.getDepartment() == "Sales" && e.getDepartment() == "Marketing").count();
		System.out.println(female + "==female");

	}

}
