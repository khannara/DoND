package com.ktx.game.dealornodeal;

import java.util.Observable;
import java.util.Observer;

public class Banker implements Observer{
	//TODO: what is the initial money?
	double totalCash = 3418418.00;
	
	//TODO: do whatever when get updated;
	public void update(Observable observable, Object object) {
		SuitCase suitCase = (SuitCase) observable;
		totalCash = totalCash - suitCase.value();
	}
	
	public int offer(Round round) {
		double averageCashPerCase = totalCash  / round.numCasesToOpen();
        if (round.numCasesToOpen() != 1) {
            return  (int) (round.getRound() * .12 * averageCashPerCase);
        }
		return (int) averageCashPerCase;
	}

}
