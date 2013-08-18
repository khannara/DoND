package com.ktx.game.dealornodeal;

import java.util.Observable;
import java.util.Observer;

public class Round implements Observer{
	private int mCasesToOpen = 26;
	private int round = 0;
	
	
	Round(int casesToOpen) {
		mCasesToOpen = casesToOpen;
		updateRound(mCasesToOpen);
	}
	
	//TODO: do whatever when get updated;
	public void update(Observable observable, Object object) {
		mCasesToOpen = mCasesToOpen--;
		updateRound(mCasesToOpen);
	}
	

	public int numCasesToOpen()
	{
		return mCasesToOpen;
	}

	public void updateRound(int casesToOpen) {
		switch (casesToOpen) {
		case 26:
		case 25:
		case 24:
		case 23:
		case 22:round = 1;
		break;
		case 21: 
		case 20:
		case 19:
		case 18:
		case 17:round = 2;
		break;
		case 16: 
		case 15:
		case 14:
		case 13:round = 3;
		break;
		case 12: 
		case 11:
		case 10:round = 4;
		break;
		case 9 : 
		case 8 :round = 5;
		break;
		case 7 :round = 6; 
		break;
		case 6 :round = 7; 
		break;
		case 5 :round = 8;
		break;
		case 4 :round = 9;
		break;
		case 3 :round = 10;
		break;
		case 2 :round = 11;
		}
	}

	public int getRound() {
		return round;
	}
}
