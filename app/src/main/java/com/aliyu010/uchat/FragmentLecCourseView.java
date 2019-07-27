package com.aliyu010.uchat;




import android.content.Intent;
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


public class FragmentLecCourseView extends Fragment {

    private RecyclerView mRecyclerView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lec_course_view, container, false);
        mRecyclerView = view.findViewById(R.id.lec_course_view_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateIU();
        return view;
    }

    public void updateIU() {
        List<Courses> myCourses = new ArrayList<>();
        Courses course;


        for (int i = 0; i < 30; i++) {
            course = new Courses();

            course.setCourseTitle("this is the cousecode " + i);
            course.setCourseCode("cosc " + i);
            myCourses.add(course);

        }

        FragmentLecCourseView.CourseViewAdapter adaper = new CourseViewAdapter(myCourses);
        mRecyclerView.setAdapter(adaper);


    }


    class CourseViewHolder extends RecyclerView.ViewHolder {

        private TextView mCourseCode;
        private TextView mCourseTitle;


        public CourseViewHolder(LayoutInflater inflater, @NonNull ViewGroup parent) {
            super(inflater.inflate(R.layout.list_lec_courses_view, parent, false));
            mCourseCode = itemView.findViewById(R.id.course_code);
            mCourseTitle = itemView.findViewById(R.id.course_title);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MessageActivity.class);
                    startActivity(intent);

                }
            });
        }
    }

    class CourseViewAdapter extends RecyclerView.Adapter<CourseViewHolder> {

        List<Courses> mCourses;

        public CourseViewAdapter(List<Courses> courses) {
            mCourses = courses;
        }

        @NonNull
        @Override
        public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());

            return new CourseViewHolder(inflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull CourseViewHolder courseViewHolder, int position) {
            Courses course = mCourses.get(position);
            courseViewHolder.mCourseCode.setText(course.getCourseCode());
            courseViewHolder.mCourseTitle.setText(course.getCourseTitle());


        }

        @Override
        public int getItemCount() {
            return mCourses.size();
        }
    }


}
