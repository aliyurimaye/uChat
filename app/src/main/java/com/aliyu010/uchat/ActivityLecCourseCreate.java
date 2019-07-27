package com.aliyu010.uchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityLecCourseCreate extends AppCompatActivity {


    private TextInputEditText mCourseCode;
    private TextInputEditText mCourseTitle;
    private Button mSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lec_course_create);
        mCourseCode = findViewById(R.id.course_code);
        mCourseTitle = findViewById(R.id.course_title);
        mSubmit = findViewById(R.id.submit);

        //firebase


        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityLecCourseCreate.this, ActivityCoursesView.class);
                startActivity(intent);

            }
        });
    }


}
