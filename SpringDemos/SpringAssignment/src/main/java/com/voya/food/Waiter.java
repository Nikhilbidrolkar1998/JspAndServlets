package com.voya.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	iFoodMenu chinese;
	
	@Autowired
	@Qualifier("indian")
	iFoodMenu foodMenu1;
	
	@Autowired
	@Qualifier("italian")
	iFoodMenu foodMenu2;
	
	
	List<String> viewMenuCard(String choice){
		if(choice.equals("chinese"))
			return chinese.ShowMenu();
		if(choice.equals("indian"))
			return foodMenu1.ShowMenu();
		if(choice.equals("italian"))
			return foodMenu2.ShowMenu();
		return null;
	}
}
