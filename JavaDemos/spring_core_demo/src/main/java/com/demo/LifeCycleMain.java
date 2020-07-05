package com.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.HelloLifeCycle;

public class LifeCycleMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext("lifecycle.xml");
		
		HelloLifeCycle h1 = context.getBean(HelloLifeCycle.class);
		System.out.println(h1.getMessage());
		
		HelloLifeCycle h2 = context.getBean(HelloLifeCycle.class);
		System.out.println(h2.getMessage());
		
		context.registerShutdownHook();
		context.close();
	}

}
