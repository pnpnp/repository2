package com.lti.JDBC;

public class Departments {
	deptName dname;

	public deptName getDname() {
		return dname;
	}

	public void setDname(deptName dname) {
		this.dname = dname;
	}

	public Departments(deptName dname) {
		super();
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Departments [dname=" + dname + "]";
	}

}
