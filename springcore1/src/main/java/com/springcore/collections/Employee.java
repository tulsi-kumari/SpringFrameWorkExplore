package com.springcore.collections;
import java.util.*;
public class Employee {
	private String empName;
	private List<String> empContact;
	private Set<String> empAdd;
	private Map<String,String> empCourses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpContact() {
		return empContact;
	}
	public void setEmpContact(List<String> empContact) {
		this.empContact = empContact;
	}
	public Set<String> getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(Set<String> empAdd) {
		this.empAdd = empAdd;
	}
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empContact=" + empContact + ", empAdd=" + empAdd + ", empCourses="
				+ empCourses + "]";
	}
	public Employee(String empName, List<String> empContact, Set<String> empAdd, Map<String, String> empCourses) {
		super();
		this.empName = empName;
		this.empContact = empContact;
		this.empAdd = empAdd;
		this.empCourses = empCourses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
