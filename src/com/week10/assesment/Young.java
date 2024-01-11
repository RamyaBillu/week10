package com.week10.assesment;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Young {

	public static void main(String[] args) {
		List<Employee> employeeList = ListEmployee.list();
          employeeList.stream().filter(e->e.getAge()).min(Comparator.comparingInt(Employee::getAge()));
          
        		  

}
