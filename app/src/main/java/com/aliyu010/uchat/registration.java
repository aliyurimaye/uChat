package com.aliyu010.uchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;



public class registration extends AppCompatActivity {


    private Button submit;
    private EditText firstname;
    private EditText lastname;
    private EditText middlename;
    private EditText regNo;
    private EditText password;
    private RadioButton male;
    private RadioButton female;
    private RadioButton student;
    private RadioButton lecturer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        submit = findViewById(R.id.submit_reg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registration.this,Menu.class);
                startActivity(intent);

            }
        });

    }
}
