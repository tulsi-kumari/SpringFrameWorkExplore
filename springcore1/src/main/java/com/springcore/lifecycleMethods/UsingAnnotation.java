package com.springcore.lifecycleMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotation {
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init (annotation)");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy (annotation)");
	}


	public UsingAnnotation() {
		// TODO Auto-generated constructor stub
	}

}
