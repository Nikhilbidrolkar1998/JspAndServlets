package com.example.javabased;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	@Autowired
	IFoodMenu menu;
	
	IFoodMenu menuItems;
	
	public void setMenuItems(IFoodMenu menuItems) {
		this.menuItems = menuItems;
	}

	public List<String> viewMenu(String choice){
		List<String> menuList=new ArrayList<>();
		if(choice.equals("in"))
			menuList=iFoodMenu.ShowMenu();
		if(choice.equals("it"))
			return menu.ShowMenu();
		if(choice.equals("ch"))
			return menuItems.ShowMenu();
		return menuList;
	}
}
