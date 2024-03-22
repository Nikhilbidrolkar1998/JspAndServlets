package com.example.javabased;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Indian implements IFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> indian=Arrays.asList("Idli","dosa");
		return indian;
	}

}
