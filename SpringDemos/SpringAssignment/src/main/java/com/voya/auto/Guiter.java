package com.voya.auto;

import org.springframework.stereotype.Component;

@Component("guiter")

public class Guiter implements IInstrument{

	@Override
	public void play(String song) {
		System.out.println("Voiline Song "+song);
		
	}

}
