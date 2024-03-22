package com.spring.autowiring;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Square implements IShape{

	
	@Override
	public void area(int x, int y) {
		System.out.println("Area of Square is "+(x*y));
		
	}
	
}
