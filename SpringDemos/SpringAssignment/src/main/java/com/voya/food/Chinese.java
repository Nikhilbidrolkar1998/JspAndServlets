package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
//@Qualifier("chinese")
public class Chinese implements iFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> chines=Arrays.asList("Noodles","Gobi");
		return chines;
	}

}