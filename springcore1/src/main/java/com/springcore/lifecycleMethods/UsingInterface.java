package com.springcore.lifecycleMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean , DisposableBean {
	private String name;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public UsingInterface() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying (Interface)");
		
	}



	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init (Interface)");
		
	}

}
