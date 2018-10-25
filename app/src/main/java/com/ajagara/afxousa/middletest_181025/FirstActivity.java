package com.ajagara.afxousa.middletest_181025;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);
        final Button loginbtn = (Button)findViewById(R.id.loginbutton);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals("midterm")) && (password.getText().toString().equals("a+100"))) {
                    Toast.makeText(FirstActivity.this, "Login Succeed", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(FirstActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
