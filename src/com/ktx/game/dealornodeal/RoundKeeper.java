package com.ktx.game.dealornodeal;

import java.util.Observable;
import java.util.Observer;


public class RoundKeeper implements Observer {
	//TODO: do whatever when get updated;
	public void update(Observable observable, Object object) {
		SuitCase suitcase = (SuitCase) object;
		System.out.println("suitcase: " + suitcase.id() + " value: " + suitcase.value());
	}
	
	RoundKeeper()
	{
		
	}
	
}
