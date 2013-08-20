package com.ktx.game.dealornodeal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.ktx.game.dealornodeal.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;


public class GameStartActivity extends Activity {
	
	private HashMap<SuitCase, ImageButton> buttonMap = new HashMap<SuitCase, ImageButton>();
	private RoundKeeper roundKeeper = new RoundKeeper();
	private Banker banker = new Banker();
	
//	static private HashMap<Integer, Integer> buttonIdMap;
//	static {
//		buttonIdMap = new HashMap<Integer, Integer>();
//		buttonIdMap.put(1, R.id.case1);
//		buttonIdMap.put(2, R.id.case2);
//		buttonIdMap.put(3, R.id.case3);
//		buttonIdMap.put(4, R.id.case4);
//		buttonIdMap.put(5, R.id.case5);
//		buttonIdMap.put(6, R.id.case6);
//		buttonIdMap.put(7, R.id.case7);
//		buttonIdMap.put(8, R.id.case8);
//		buttonIdMap.put(9, R.id.case9);
//		buttonIdMap.put(10, R.id.case10);
//		buttonIdMap.put(11, R.id.case11);
//		buttonIdMap.put(12, R.id.case12);
//		buttonIdMap.put(13, R.id.case13);
//		buttonIdMap.put(14, R.id.case14);
//		buttonIdMap.put(15, R.id.case15);
//		buttonIdMap.put(16, R.id.case16);
//		buttonIdMap.put(17, R.id.case17);
//		buttonIdMap.put(18, R.id.case18);
//		buttonIdMap.put(19, R.id.case19);
//		buttonIdMap.put(20, R.id.case20);
//		buttonIdMap.put(21, R.id.case21);
//		buttonIdMap.put(22, R.id.case22);
//		buttonIdMap.put(23, R.id.case23);
//		buttonIdMap.put(24, R.id.case24);
//		buttonIdMap.put(25, R.id.case25);
//		buttonIdMap.put(26, R.id.case26);
//	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gamestart);
		SuitCaseFactory suitCaseFactory = new SuitCaseFactory();
		suitCaseFactory.init();
		Iterator<SuitCase> iterator = suitCaseFactory.allSuitCases.iterator();
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case1));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case2));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case3));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case4));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case5));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case6));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case7));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case8));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case9));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case10));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case11));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case12));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case13));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case14));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case15));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case16));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case17));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case18));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case19));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case20));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case21));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case22));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case23));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case24));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case25));
		buttonMap.put(iterator.next(), (ImageButton) findViewById(R.id.case26));

		
		
		
		for (HashMap.Entry<SuitCase, ImageButton> entry : buttonMap.entrySet()) {
		    final ImageButton imageButton = entry.getValue();
		    final SuitCase suitCase = entry.getKey();
		    Log.i("CaseId:", ""+suitCase.id());
			imageButton.setOnClickListener(new View.OnClickListener() {
			
				@Override
				public void onClick(View v) {
					suitCase.openCase();
					imageButton.setImageResource(R.drawable.open_case2);
					
				}
			});
		}
	}
}
