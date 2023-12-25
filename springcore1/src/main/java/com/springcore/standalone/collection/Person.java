package com.springcore.standalone.collection;

import java.util.*;

public class Person {
	private List<String> contacts;
	private Map<String,String> address;
	private Set<String> relatives;
	private Properties marks;
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	public Properties getMarks() {
		return marks;
	}
	public void setMarks(Properties marks) {
		this.marks = marks;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Set<String> getRelatives() {
		return relatives;
	}
	public void setRelatives(Set<String> relatives) {
		this.relatives = relatives;
	}
	public Person(List<String> contacts, Map<String, String> address, Set<String> relatives, Properties marks) {
		super();
		this.contacts = contacts;
		this.address = address;
		this.relatives = relatives;
		this.marks = marks;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [contacts=" + contacts + ", address=" + address + ", relatives=" + relatives + ", marks=" + marks
				+ "]";
	}
	
}
