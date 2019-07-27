package com.aliyu010.uchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;



public class tutorMenu extends AppCompatActivity {


    private CardView createCourse;
    private CardView viewCourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_menu);

        createCourse = findViewById(R.id.create_course);
        viewCourses = findViewById(R.id.view_courses);


        createCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(tutorMenu.this, ActivityLecCourseCreate.class);
                startActivity(intent);
            }
        });

        viewCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tutorMenu.this, ActivityLecCourseView.class);
                startActivity(intent);
            }
        });
    }



}