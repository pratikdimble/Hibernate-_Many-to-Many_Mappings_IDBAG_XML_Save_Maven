package com.app.model;

import java.util.ArrayList;
import java.util.List;



public class Address {
	
	private int addrId;
	private String location;
	private List<Employee> emps=new ArrayList<Employee>();
	

	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", location=" + location + ", emps=" + emps + "]";
	}

	
	
}
