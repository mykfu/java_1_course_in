package ru.kpfu.classwork.Lesson_13;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());

        Cylinder cylinder = new Cylinder(10, "blue", 20);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getLength());

    }
}
