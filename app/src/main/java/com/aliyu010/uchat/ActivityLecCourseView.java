package com.aliyu010.uchat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityLecCourseView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_course_view);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.course_view_recycler);

        if (fragment == null) {

            fragment = new FragmentCoursesView();

            fm.beginTransaction().add(R.id.fragment_course_view_container, fragment).commit();

        }

    }
}
