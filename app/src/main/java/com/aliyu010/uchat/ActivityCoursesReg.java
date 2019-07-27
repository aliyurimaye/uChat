package com.aliyu010.uchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;


public class ActivityCoursesReg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_reg);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.courses_to_reg);

        if (fragment == null) {
            fragment = new FragmentCoursesToRegister();
            fm.beginTransaction().add(R.id.fragment_course_reg_container, fragment).commit();
        }
    }
}
