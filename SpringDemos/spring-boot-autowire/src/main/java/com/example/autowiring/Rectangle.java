package com.example.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangle")
public class Rectangle implements IShape{

	@Override
	public void area(int x, int y) {
		System.out.println("Area of Rectangle is "+(2*x*y));
		
	}
	
}
