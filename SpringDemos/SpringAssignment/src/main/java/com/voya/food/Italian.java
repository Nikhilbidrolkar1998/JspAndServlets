package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
//@Qualifier("italian")
public class Italian implements iFoodMenu{

	@Override
	public List<String> ShowMenu() {
		List<String> italian=Arrays.asList("Sizwan","kowmin");
		return italian;
	}

}
