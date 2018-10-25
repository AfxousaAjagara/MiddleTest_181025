package com.ajagara.afxousa.middletest_181025;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ThirdActivity extends SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final Button button1 = (Button)findViewById(R.id.button_1);
        final Button button4 = (Button)findViewById(R.id.button_4);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(ThirdActivity.this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(ThirdActivity.this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        final Button button2 = (Button)findViewById(R.id.button_2);
        final Button button3 = (Button)findViewById(R.id.button_3);

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(button3.getText().toString().equals("button3"))
                    button3.setText("Btn Chg");
                else
                    button3.setText("button3");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(button2.getText().toString().equals("button2"))
                    button2.setText("Btn Chg");
                else
                    button2.setText("button2");
            }
        });

        final Button button5 = (Button)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.button456_layout);
                linearLayout.setGravity(Gravity.CENTER);
            }
        });

        final Button button6 = (Button)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                LinearLayout linearLayout = (LinearLayout)findViewById(R.id.bottomlayout);
                linearLayout.setPadding(20,20,20,20);
            }
        });
    }

    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        setResult(RESULT_OK, intent);
        super.onBackPressed();
        startActivity(intent);
    }
}
