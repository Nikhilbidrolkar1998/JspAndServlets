package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.setter.Employee;

public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.spring.autowiring");
		Shapefactory shapefactory=(Shapefactory) context.getBean("shapefactory");
		shapefactory.printArea("r",10,20);
		shapefactory.printArea("t",10,20);
		shapefactory.printArea("s",10,20);
	}

}
