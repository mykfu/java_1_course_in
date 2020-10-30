package ru.kpfu.classwork.Lesson_14;

/*
*
Student ext Person
numCourses: int
courses: String[] max 30
grades: int[]
addCourseGrade(course, grade)
printGrades()
getAvgGrades():double
toString() // Student: name(address)
*/

public class Student extends Person {

    public final static int MAX_COURSES_COUNT = 30;
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES_COUNT];
        grades = new int[MAX_COURSES_COUNT];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println(toString());
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("  \"%s\": %d%n", courses[i], grades[i]);
        }
    }

    public double getAvgGrades() {
        double result = 0;

        for (int i = 0; i < numCourses; i++) {
            result += grades[i];
        }
        return result / numCourses;
    }

//    @Override
//    public String toString() {
//        return "Student: " + super.toString();
//    }
}
