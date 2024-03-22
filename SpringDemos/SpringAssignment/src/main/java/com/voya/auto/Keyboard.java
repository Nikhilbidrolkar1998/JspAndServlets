package com.voya.auto;

import org.springframework.stereotype.Component;

@Component("keyboard")
public class Keyboard implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("Keyboard Song "+song);
		
	}

}
