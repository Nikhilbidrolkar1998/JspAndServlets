package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Chinese implements IFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> chines=Arrays.asList("Noodles","Gobi");
		return chines;
	}

}
