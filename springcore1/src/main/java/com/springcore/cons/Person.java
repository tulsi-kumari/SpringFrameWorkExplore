package com.springcore.cons;

public class Person {
	private String name;
	private int income;
	private Certificate cer;
	public Person(String name, int income, Certificate cer) {
		super();
		this.name = name;
		this.income = income;
		this.cer = cer;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", cer=" + cer + "]";
	}
	

}
