package com.ktx.game.dealornodeal;

import java.util.Observable;
import java.util.Observer;

public class Banker implements Observer{
	//TODO: what is the initial money?
	double totalCash = 3000000.00;
	
	//TODO: do whatever when get updated;
	public void update(Observable observable, Object object) {
		SuitCase suitCase = (SuitCase) observable;
		totalCash = totalCash - suitCase.value();
	}
	
	public double offer(Round round) {
		double averageCashPerCase = totalCash/round.numCasesToOpen();
		return averageCashPerCase * round.getRound()/9.986;
	}

}
