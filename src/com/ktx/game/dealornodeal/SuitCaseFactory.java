package com.ktx.game.dealornodeal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import java.util.Random;

public abstract class SuitCaseFactory {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	ArrayList<SuitCase> allSuitCases = new ArrayList<SuitCase>();
	
	public void init()
	{
		allSuitCases.add(new SuitCase.SuitCaseBuilder(1, 1).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(2, 2).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(3, 5).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(4, 10).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(5, 25).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(6, 50).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(7, 75).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(8, 100).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(9, 200).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(10, 300).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(11, 400).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(12, 500).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(13, 750).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(14, 1000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(15, 5000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(16, 10000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(17, 25000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(18, 50000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(23, 75000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(19, 100000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(20, 200000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(21, 300000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(22, 400000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(24, 500000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(25, 750000).open(false).observers(observers).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(26, 1000000).open(false).observers(observers).build());
	}

	public void shuffle(ArrayList<SuitCase> allSuitCases) {
		Random random = new Random(System.currentTimeMillis());
		Iterator<SuitCase> iterator = allSuitCases.iterator();
		while (iterator.hasNext()) {
			swap(iterator.next(), allSuitCases.get(random.nextInt(26)));
		}
	}
	
	public static <T> void swap(T object1, T object2) {
		T temp = object1;
		object1 = object2;
		object2 = temp;
	}

}
