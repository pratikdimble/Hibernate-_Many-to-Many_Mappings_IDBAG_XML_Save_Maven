package com.app.model;

import java.util.HashSet;
import java.util.Set;



public class Employee {

	private int empId;
	private String empName;
	private Set<Address> addr=new HashSet<Address>();
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public Set<Address> getAddr() {
		return addr;
	}
	public void setAddr(Set<Address> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}
	
	
	
}
