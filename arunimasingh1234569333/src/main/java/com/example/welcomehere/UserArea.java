package com.example.welcomehere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserArea extends AppCompatActivity {
    TextView tvwelcome,tvuser; EditText etuname;
    Button btnlgout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        tvwelcome  = (TextView) findViewById(R.id.tvwelcome);
        tvuser  = (TextView) findViewById(R.id.tvuser);
        etuname  = (EditText) findViewById(R.id.etuname);
        btnlgout = (Button) findViewById(R.id.btnlgout);
        btnlgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent= new Intent(UserArea.this ,MainActivity.class);
                UserArea.this.startActivity(loginIntent);
            }
        });
    }
}
