package com.example.carl.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    LinearLayout background;
    Button one, two, three, plus, equals, clear;
    TextView calcDisplay;

    private final String TAG = "CLC";
    public String curInput;
    public Integer sumInput=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_layout);
        Log.d(TAG,"onCreate");


        background=(LinearLayout) findViewById(R.id.background);
        calcDisplay=(TextView) findViewById(R.id.calcDisplay);
        one=(Button) findViewById(R.id.one);
        two=(Button) findViewById(R.id.two);
        three=(Button) findViewById(R.id.three);
        plus=(Button) findViewById(R.id.plus);
        equals=(Button) findViewById(R.id.equals);
        clear=(Button) findViewById(R.id.clear);


        //Action for number 1
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Action for number 2
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Action for number 3
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Action for plus
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Action for equals
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<curInput.length();i++){
                    if(curInput[i].isInteger){
                        sumInput=sumInput+curInput[i];
                    }

                }
                calcDisplay.setText(curInput);
            }
        });

        //Action for clear
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curInput="0";

            }
        });







    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
