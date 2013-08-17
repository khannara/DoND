package com.ktx.game.dealornodeal;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class SuitCase extends Observable {
	private ArrayList<Observer> observers; 
	private final int id;
	private final int value; 
	boolean open;
	
	private SuitCase(SuitCaseBuilder suitCaseBuilder) {
		id 				= suitCaseBuilder.id;
		value 			= suitCaseBuilder.value;
		open 			= suitCaseBuilder.open; 
		observers		= suitCaseBuilder.observers;
	}
	
	public static class SuitCaseBuilder {
		// required fields
		private final int id;  
		private final int value; 
		// optional fields
		boolean open = false; 
		private ArrayList<Observer> observers = new ArrayList<Observer>();

		public SuitCaseBuilder(int id, int value) {
			this.id = id; 
			this.value = value; 
		}	
		public SuitCaseBuilder open(boolean input) {
			open = input; 
			return this; 
		}
		public SuitCaseBuilder observers (ArrayList<Observer> input) {
			observers = input;
			return this;
		}
		public SuitCase build() {
			return new SuitCase(this);
		}
	}

	public void openCase() {  
        if(this.open != true) {  
            this.open = true;  
            setChanged();  
            notifyObservers(this); 
        }  
	}
	
	public int id() {
		return this.id;
	}
	
	public int value() {
		return this.value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

