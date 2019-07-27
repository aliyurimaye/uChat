package com.aliyu010.uchat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Courses> mCoursesList = new ArrayList<Courses>();
    //declearation
    private Button logging;
    private TextView notUser;
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialization
        logging = findViewById(R.id.logging);
        notUser = findViewById(R.id.not_user);
        userName = findViewById(R.id.user_name);
        password = findViewById(R.id.password);


        notUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regActivity = new Intent(MainActivity.this, registration.class);
                startActivity(regActivity);


            }
        });


        logging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (userName.getText() != null && (userName.getText().charAt(0) == 'u' || userName.getText().charAt(0) == 'U')) {

                    Intent regActivity = new Intent(MainActivity.this, Menu.class);
                    startActivity(regActivity);
                } else if (userName.getText() != null && (userName.getText().charAt(0) == 'l' || userName.getText().charAt(0) == 'L')) {

                    Intent regActivity = new Intent(MainActivity.this, tutorMenu.class);
                    startActivity(regActivity);

                } else
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();


            }
        });


    }


    public void addCourses() {


        for (int i = 0; i < 100; i++) {

            Courses course = new Courses();

            course.setCourseCode("Courscode " + i);
            course.setCourseTitle("courseTitle " + i);
            mCoursesList.add(course);

        }


        RecyclerView recyclerView = findViewById(R.id.course_view_recycler);
        //CoursesViewAdapter coursesViewAdapter=new CoursesViewAdapter(mCoursesList);
        //recyclerView.setAdapter(coursesViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
