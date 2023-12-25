package com.springcore.stereotype.annotation;

import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Person {
	@Value("Tulsi")
	String name;
	@Value("#{2>3}")
	boolean isMarried;
	@Value("#{temp}")
	List<String> contacts;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	double sqrt;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", isMarried=" + isMarried + ", contacts=" + contacts + ", sqrt=" + sqrt + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		super();
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
