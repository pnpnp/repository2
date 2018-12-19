package com.lti.JDBC;

public class Employee {
	int employee_id;
	String first_name;
	String last_name;
	double salary;
	double phone_number;
	Departments dept;

	public Employee(int employee_id, String first_name, String last_name, double salary, double phone_number,
			Departments dept) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
		this.phone_number = phone_number;
		this.dept = dept;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(double phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", salary=" + salary + ", phone_number=" + phone_number + ", dept=" + dept + "]";
	}

	public Departments getDept() {
		return dept;
	}

	public void setDept(Departments dept) {
		this.dept = dept;
	}

}
