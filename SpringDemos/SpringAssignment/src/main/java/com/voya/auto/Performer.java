package com.voya.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	@Qualifier("voiline")
	IInstrument iInstrument;
	
	@Autowired
	@Qualifier("keyboard")
	IInstrument iInstrument1;
	
	@Autowired
	@Qualifier("guiter")
	IInstrument iInstrument2;
	
	void playMusic(String choice,String song) {
		if(choice.equals("v"))
			iInstrument1.play(song);
		if(choice.equals("k"))
			iInstrument.play(song);
		if(choice.equals("g"))
			iInstrument2.play(song);
	}
}
