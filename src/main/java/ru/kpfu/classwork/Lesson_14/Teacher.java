package ru.kpfu.classwork.Lesson_14;

import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses;
    private String[] courses;
    public final static int MAX_COURSES_COUNT = 5;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES_COUNT];
    }

    public boolean addCourse(String course) {
        if (numCourses == MAX_COURSES_COUNT) return false;
        if (numCourses > 0)
            for (String c : courses) {
                if (c.equals(course)) return false;
            }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

}
