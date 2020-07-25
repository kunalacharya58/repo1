package demo.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CPU {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Processor processor = context.getBean("intel", Processor.class);
		
		processor.playGames();
		processor.runApps();
		processor.executePrograms();
		
	}

}
