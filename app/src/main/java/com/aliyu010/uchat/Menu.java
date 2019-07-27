package com.aliyu010.uchat;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Menu extends AppCompatActivity {


    private CardView regCourse;
    private CardView viewCourse;
    private CardView location;
    private CardView news;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        regCourse = findViewById(R.id.course_reg);
        viewCourse = findViewById(R.id.view_courses);
        location = findViewById(R.id.location);
        news = findViewById(R.id.news);


        regCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ActivityCoursesReg.class);
                startActivity(intent);
            }
        });
        viewCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, ActivityCoursesView.class);
                startActivity(intent);
            }
        });


    }


}
