package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Hello;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		Hello h = context.getBean("h1");
//		System.out.println(h.getMessage());
		
//		Hello h1 = (Hello) context.getBean("h1");
//		System.out.println(h1.getMessage());
//		
//		Hello h2 = (Hello) context.getBean("h2");
//		System.out.println(h2.getMessage());
		
		
	}

}
