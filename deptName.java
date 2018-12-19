package com.lti.JDBC;

public enum deptName {
	SHIPPING(50), FINANCE(100), CONTROL_AND_CREDIT(140), PUBLIC_RELATIONS(70);

	int id;

	deptName(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// public int getId() {
	// return id;
	// }
	//
	// public void setId(int id) {
	// this.id = id;
	// }
}
