package com.example.assignmentsinupdesing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fnameET,lnameET,emailET,numberET,passwordET,rpasswordET;
    Button sign_up_button;
    String fname,lname,email,number,password,rpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fnameET = findViewById(R.id.fnameET);
        lnameET = findViewById(R.id.lnameET);
        emailET = findViewById(R.id.emailET);
        numberET = findViewById(R.id.phoneET);
        passwordET = findViewById(R.id.passwordET);
        rpasswordET = findViewById(R.id.rpasswordET);
        sign_up_button = findViewById(R.id.signupBTN);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fname = fnameET.getText().toString();
                lname = lnameET.getText().toString();
                email = emailET.getText().toString();
                number = numberET.getText().toString();
                password = passwordET.getText().toString();
                rpassword = rpasswordET.getText().toString();

                if(fname.isEmpty()){
                    fnameET.setError("Please enter first name");
                }
                else if(lname.isEmpty()){
                    lnameET.setError("Please enter last name");
                }
                else if(email.isEmpty()){
                    emailET.setError("Please enter email first");
                }
                else if(number.isEmpty()){
                    numberET.setError("Please enter number first");
                }
                else if(password.isEmpty() || password.length()<6){

                    Toast.makeText(MainActivity.this, "Please enter 6 digit password first", Toast.LENGTH_SHORT).show();
                }
                else if(!rpassword.equals(password)){

                    Toast.makeText(MainActivity.this, "password and retype password must be same", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Name: "+fname+" "+lname+"\nEmail: "+
                            email+"\nNumber: "+number+"\nPassword: "+password,Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}