package com.ktx.game.dealornodeal;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

public class SuitCaseFactory {
	ArrayList<SuitCase> allSuitCases = new ArrayList<SuitCase>();
	
	public void init()
	{
		allSuitCases.add(new SuitCase.SuitCaseBuilder(1, 1).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(2, 2).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(3, 5).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(4, 10).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(5, 25).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(6, 50).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(7, 75).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(8, 100).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(9, 200).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(10, 300).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(11, 400).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(12, 500).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(13, 750).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(14, 1000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(15, 5000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(16, 10000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(17, 25000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(18, 50000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(23, 75000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(19, 100000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(20, 200000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(21, 300000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(22, 400000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(24, 500000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(25, 750000).open(false).build());
		allSuitCases.add(new SuitCase.SuitCaseBuilder(26, 1000000).open(false).build());
	}

	static public <T> void  shuffle(ArrayList<T> list) {
		Random random = new Random(System.currentTimeMillis());
		for(int i = 0; i < list.size(); i++) {
            swap(list, i, random.nextInt(list.size()));
		}
	}

	private static <T> void swap(ArrayList<T> list, int index1, int index2) {
		T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
	}

	public SuitCase getSuitCase(int id){
		for (SuitCase suitCase : allSuitCases){
			if (suitCase.id() == id ) {
				return suitCase;
			}
		}
		return null;
	}
	public void addObservers(Observer observer) {
		for (SuitCase suitCase : allSuitCases) {
			suitCase.addObserver(observer);
		}
	}

    public ArrayList getAllSuitCases() {
        return allSuitCases;
    }
}
