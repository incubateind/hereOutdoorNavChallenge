package com.example.welcomehere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

EditText evPhone, etname,etpassword1,etpassword2;
Button btnReg;
    String evps = evPhone.getText().toString().trim();
    String etns = etname.getText().toString().trim();
    String etp1s = etpassword1.getText().toString().trim();
    String etp2s = etpassword2.getText().toString().trim();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        evPhone = (EditText) findViewById(R.id.evPhone);
        etname = (EditText) findViewById(R.id.etname);
        etpassword1 = (EditText) findViewById(R.id.etpassword1);
        etpassword2 = (EditText) findViewById(R.id.etpassword2);
        btnReg = (Button) findViewById(R.id.btnReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // openUserArea();
            }
        });

    }
   /* public void btnReg(){

        if (!validate()){
            Toast.makeText(this,"Signup has failed",Toast.LENGTH_SHORT).show();
        }
        else{
            onSignupSuccess();
        }
    }



   public void onSignupSuccess(){}
        public boolean validate(){
            boolean valid = true;
            if(evps.isEmpty()||evPhone.length()>32) {
                evPhone.setError("Please enter valid name");
                valid = false;
            }
            if(etns.isEmpty()) {
                etname.setError("Please enter valid name");
                valid = false;
            }
            if(etp1s.isEmpty()) {
                etpassword1.setError("Please enter valid password");
                valid = false;
            }
            if(etp2s.isEmpty()) {
                etpassword2.setError("Please enter valid password, password and confirm password should be same");
                valid = false;
            }
            return valid;


        }
        public void openUserArea(){
            Intent intent = new Intent(Register.this,UserArea.class);
            Register.this.startActivity(intent);
    }*/
}
