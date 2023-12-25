package com.springcore.lifecycleMethods;

public class Person {
	private String name;
	

	public Person(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}


	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Init Method called");
	}
	public void destroy()
	{
		System.out.println("Destroy Method Called");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
