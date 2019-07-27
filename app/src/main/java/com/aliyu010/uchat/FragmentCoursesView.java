package com.aliyu010.uchat;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class FragmentCoursesView extends Fragment {


    private RecyclerView mRecyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //wiring fragment_courses_view.xml with this class
        View view = inflater.inflate(R.layout.fragment_courses_view, container, false);

        mRecyclerView = view.findViewById( R.id.course_view_recycler);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateIU();

        return view;

    }

    public void updateIU() {

        List<Courses> myCourses = new ArrayList<>();
        Courses course;

        for (int i = 0; i < 50; i++) {
            course = new Courses();

            course.setCourseTitle("this is the cousecode " + i);
            course.setCourseCode("cosc " + i);
            myCourses.add(course);

        }
        CoursesViewAdaper adaper = new CoursesViewAdaper(myCourses);
        mRecyclerView.setAdapter(adaper);


    }


    //Recycleview viewholder class
    class FragmentCoursesHolder extends RecyclerView.ViewHolder {

        private TextView courseCode;
        private TextView courseTitle;


        public FragmentCoursesHolder(@NonNull LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_view_courses, parent, false));

            courseCode = itemView.findViewById(R.id.course_code);
            courseTitle = itemView.findViewById(R.id.course_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(getActivity(), MessageActivity.class);
                    startActivity(intent);


                }
            });
        }
    }


    //Recyclerview viewadapter
    class CoursesViewAdaper extends RecyclerView.Adapter<FragmentCoursesHolder> {


        private List<Courses> mCourses;

        public CoursesViewAdaper(List<Courses> courses) {

            mCourses = courses;
        }

        @NonNull
        @Override
        public FragmentCoursesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());

            return new FragmentCoursesHolder(layoutInflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(@NonNull FragmentCoursesHolder fragmentCoursesHolder, int position) {


            Courses course = mCourses.get(position);
            fragmentCoursesHolder.courseTitle.setText(course.getCourseTitle());
            fragmentCoursesHolder.courseCode.setText(course.getCourseCode());


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
