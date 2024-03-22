package com.voya.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Calculator {
	
//	Supplier<String> supplier=()->"hello";
//	};
//	supplier.get();
	public int sum(int x,int y){
        return x+y;
    }
	public int product(int x,int y) {
		return x*y;
	}
	public String greetMessage(String name) {
		return "Welcome "+name;
	}
	public List<String> showCourses(List<String> courses){
//		courses= Arrays.asList("java", "css","Spring","Angular");
		Collections.sort(courses);
		return courses;
	}
}
