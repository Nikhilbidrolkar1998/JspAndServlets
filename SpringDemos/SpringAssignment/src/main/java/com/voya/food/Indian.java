package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("indian")
public class Indian implements iFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> indian=Arrays.asList("Idli","dosa");
		return indian;
	}

}