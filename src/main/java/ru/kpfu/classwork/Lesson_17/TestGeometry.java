package ru.kpfu.classwork.Lesson_17;

public class TestGeometry {
    public static void main(String[] args) {
        PlateGeometricObject triangle = new Triangle();
        Triangle triangle2 = new Triangle();
        PlateGeometricObject point = new Point();

        System.out.println(triangle.getArea());
        System.out.println(triangle2.getColor());
//        System.out.println(triangle.getColor());

        Colorful colorful = new Triangle();
        System.out.println(colorful.getColor());



    }
}
