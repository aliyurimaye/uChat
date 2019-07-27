package com.aliyu010.uchat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class FragmentCoursesToRegister extends Fragment{

    private RecyclerView mRecyclerView;
    private TextView courseTitle;
    private TextView courseCode;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //wiring fragment_courses_to_register.xml with this class
        View view = inflater.inflate(R.layout.fragment_courses_to_register, container, false);
        mRecyclerView = view.findViewById(R.id.courses_to_reg);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        updateUI();
        return view;

    }



    public void updateUI() {

        List<Courses> courses = new ArrayList<>();
        Courses course = new Courses();
        for (int i = 0; i < 100; i++) {
            course.setCourseCode("cosc" + i);
            course.setCourseTitle("this is the course title" + i);
            courses.add(course);
        }

        CourseToRegisterAdapter adapter = new CourseToRegisterAdapter(courses);
        mRecyclerView.setAdapter(adapter);

    }

    private class CourseToRegisterHolder extends RecyclerView.ViewHolder {

        public CourseToRegisterHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_reg_courses, parent, false));

            courseCode = itemView.findViewById(R.id.course_code);
            courseTitle = itemView.findViewById(R.id.course_title);

        }
    }

    private class CourseToRegisterAdapter extends RecyclerView.Adapter<CourseToRegisterHolder> {

        List<Courses> mCourses;

        public CourseToRegisterAdapter(List<Courses> courses) {
            mCourses = courses;
        }

        @NonNull
        @Override
        public CourseToRegisterHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());

            return new CourseToRegisterHolder(inflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull CourseToRegisterHolder courseToRegisterHolder, int position) {
            Courses course = mCourses.get(position);
            courseCode.setText(course.getCourseCode());
            courseTitle.setText(course.getCourseTitle());

        }

        @Override
        public int getItemViewType(int position) {
            return super.getItemViewType(position);
        }

        @Override
        public int getItemCount() {
            return mCourses.size();
        }
    }

}
