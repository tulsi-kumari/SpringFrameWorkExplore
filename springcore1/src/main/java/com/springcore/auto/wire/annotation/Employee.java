package com.springcore.auto.wire.annotation;
import org.springframework.beans.factory.annotation.*;
public class Employee {
	@Autowired
	@Qualifier("address1")
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
