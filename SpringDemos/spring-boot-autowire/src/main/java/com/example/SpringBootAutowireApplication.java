package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.autowiring.Shapefactory;
import com.example.javabased.Waiter;

@SpringBootApplication
public class SpringBootAutowireApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowireApplication.class, args);
	}
	
	@Autowired
	Shapefactory shapefactory;
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
//		shapefactory.printArea("t", 20, 30);
		
		List<String> menulist=waiter.viewMenu("ch");
		for(String menu : menulist){
			System.out.println(menu);
		}
	}

}