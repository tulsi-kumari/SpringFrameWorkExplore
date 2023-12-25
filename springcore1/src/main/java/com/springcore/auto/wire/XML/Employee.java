package com.springcore.auto.wire.XML;

public class Employee {
	public Address address;


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
