package demo.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Computer {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		
		CPU cpu = context.getBean("cpu", CPU.class);
		
		System.out.println("Device is switched on!");
		
		cpu.boot();
	}

}
