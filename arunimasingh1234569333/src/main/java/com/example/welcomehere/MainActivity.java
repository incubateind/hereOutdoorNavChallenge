package com.example.welcomehere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etMobile  = (EditText) findViewById(R.id.etMobile);
        final EditText etpassword  = (EditText) findViewById(R.id.etpassword);
        final Button btnlogin  = (Button) findViewById(R.id.btnlogin);
        final TextView etforget  = (TextView) findViewById(R.id.etforget);
        Button regBtn = (Button) findViewById(R.id.rerBtn);
       // final TextView etregister  = (TextView) findViewById(R.id.etregister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginintent =new Intent(MainActivity.this,UserArea.class);
                MainActivity.this.startActivity(loginintent);
            }
        });
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg = new Intent(MainActivity.this,Register.class);
                MainActivity.this.startActivity(reg);
            }
        });

    }
}