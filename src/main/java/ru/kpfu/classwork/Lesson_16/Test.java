package ru.kpfu.classwork.Lesson_16;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("Running main()...");

        System.out.println(Circle.DEFAULT_COLOR);
        System.out.println("After static color.");

        final Circle circle = new Circle(10, "red");
        circle.setColor("green");

        System.out.println("Loaded.");
        System.out.println(Circle.getCounter());
        Circle circle2 = new Circle(342, "blue");
        System.out.println(Circle.getCounter());
        Circle circle3 = new Circle(65, "green");
        System.out.println(Circle.getCounter());
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());


        Figure fig = new Circle();
        Figure fig2 = new Cylinder();
        Figure fig3 = new Triangle();

        Figure fig4 = new Figure() {
            @Override
            public double getArea() {
                return 100;
            }

            @Override
            public String toString() {
                return "Anonymous class {" + getArea() + "}";
            }
        };
        Figure[] figs = {new Circle(), new Cylinder(), new Triangle(), fig4, new Figure() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        }};

        System.out.println(Arrays.toString(figs));

        int circleCount = 0;
        int circleCount2 = 0;
        int figCount = 0;
        for (Figure f : figs) {

            if (f.getClass().equals(Circle.class)) {
                circleCount2++;
            }

            if (f.getClass().getName().equals("ru.kpfu.classwork.Lesson_16.Circle")) {
                circleCount++;
            }

            if (f instanceof Circle) {
                figCount++;
            }
            System.out.println(f.getArea());
        }
        System.out.println("circleCount = " + circleCount);
        System.out.println("circleCount2 = " + circleCount2);
        System.out.println("figCount = " + figCount);


    }
}
