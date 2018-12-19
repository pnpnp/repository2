package com.lti.JDBC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestHR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departments d = new Departments(deptName.CONTROL_AND_CREDIT);
		Employee e = new Employee(1, "pratik", "patil", 23000, 25252, d);
		// System.out.println(e);

		List<Employee> emplist = new ArrayList<>();
		emplist.add(e);

		List<Employee> allEmp = new ArrayList<>();
		allEmp.addAll(emplist);

		Iterator iterator = allEmp.iterator();
		while (iterator.hasNext()) { // has next returns boolean value
			Employee emp = (Employee) iterator.next();
			System.out.println(emp);
		}

		// System.out.println(deptName.PUBLIC_RELATIONS.id);

	}

}
