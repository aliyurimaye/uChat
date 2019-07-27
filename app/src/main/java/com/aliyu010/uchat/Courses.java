package com.aliyu010.uchat;

import java.util.UUID;

public class Courses {

    String mCourseCode;
    String mCourseTitle;
    UUID mId;


    public Courses(String courseCode, String courseTitle) {
        mCourseCode = courseCode;
        mCourseTitle = courseTitle;
    }


    public Courses() {

        mId = UUID.randomUUID();

    }

    public UUID getId() {
        return mId;
    }

    public String getCourseCode() {
        return mCourseCode;
    }

    public void setCourseCode(String courseCode) {
        mCourseCode = courseCode;
    }

    public String getCourseTitle() {
        return mCourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        mCourseTitle = courseTitle;
    }
}
