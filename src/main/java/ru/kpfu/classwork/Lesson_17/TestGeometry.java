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


        Point a = new Point(0, 0);
        Point b = new Point(3, 7);

        PlateGeometricObject c = new Point(10, -123);

        Point c1 = (Point) c;
        System.out.println(c1.getX());

        PlateGeometricObject d = new PlateGeometricObject() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        MovablePoint mv1 = new MovablePoint(123, 543);
        System.out.println(mv1);


    }
}
