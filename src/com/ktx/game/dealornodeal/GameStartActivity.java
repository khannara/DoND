package com.ktx.game.dealornodeal;

import java.util.HashMap;
import java.util.Iterator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class GameStartActivity extends Activity {
	
	private HashMap<SuitCase, ImageButton> buttonMap = new HashMap<SuitCase, ImageButton>();
	private Round round = new Round(26,1);
	private Banker banker = new Banker();
    TextView textView;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gamestart);
		SuitCaseFactory suitCaseFactory = new SuitCaseFactory();
		suitCaseFactory.init();
        suitCaseFactory.addObservers(round);
        suitCaseFactory.addObservers(banker);
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
	}

    @Override
    protected void onResume() {
        super.onResume();

        textView = (TextView) findViewById(R.id.text);
        for (HashMap.Entry<SuitCase, ImageButton> entry : buttonMap.entrySet()) {
            final ImageButton imageButton = entry.getValue();
            final SuitCase suitCase = entry.getKey();

            imageButton.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    suitCase.openCase();
                    textView.setText("offering: " + banker.offer(round));
                    imageButton.setImageResource(R.drawable.open_case2);

                }
            });
        }
    }
}
