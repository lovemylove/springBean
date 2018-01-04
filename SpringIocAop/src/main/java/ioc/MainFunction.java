package ioc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFunction {

	public static void main(String[] args) {

		ApplicationContext context  = new ClassPathXmlApplicationContext("aop.xml");
		
		HelloWorld hw1 = (HelloWorld)context.getBean("helloworld1");
		HelloWorld hw2 = (HelloWorld)context.getBean("helloworld2");
		
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();

		System.out.println();
		hw2.printHelloWorld();
		System.out.println();
		hw2.doPrint();
		
	}

}
