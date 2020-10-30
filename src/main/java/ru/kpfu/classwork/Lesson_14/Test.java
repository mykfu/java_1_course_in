package ru.kpfu.classwork.Lesson_14;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Ivan Petrov", "Kremlin ul., d.18");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        person.setAddress("Kremlin ul., d. 35");
        System.out.println(person.getAddress());
        System.out.println(person.toString());
        System.out.println("max courses = " + Student.MAX_COURSES_COUNT);

        Student max = new Student("Maxim Ivanov",
                "Kazan, universiade village, d. 1");

        max.addCourseGrade("Informatics", 5);
        max.addCourseGrade("Math Analysis", 4);
        max.addCourseGrade("Algebra", 3);
        max.addCourseGrade("Russian", 2);

        max.printGrades();
        System.out.println(max.getAvgGrades());

        Teacher petr = new Teacher("Petr Sherstnev", "Kazan, ul. Baki");
        System.out.println(petr);

        if (petr.addCourse("Informatics")) {
            System.out.println("Added successfully.");
        } else {
            System.out.println("Couldn't add course.");
        }
        if (petr.addCourse("Informatics")) {
            System.out.println("Added successfully.");
        } else {
            System.out.println("Couldn't add course.");
        }



    }
}
