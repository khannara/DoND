package com.ktx.game.dealornodeal;

import java.util.Observable;
import java.util.Observer;

public class Round implements Observer{
	//TODO: do whatever when get updated;
		public void update(Observable observable, Object object) {

		}
	
	Round(int round)
	{
		
	}
	
	public int numCasesToOpen()
	{
		return mCasesToOpen;
	}
	
	private int mCasesToOpen;
}
