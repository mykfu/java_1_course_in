package ru.kpfu.classwork.Lesson_16;

public class Circle extends Figure {
    private static int number1 = 88;
    private static int number2 = 22;
    static {
        System.out.println("Class initialized.");
        System.out.println("number1 is " + number1);
        System.out.println("number2 is " + number2);

    }

    protected double radius;
    protected String color;
    private static int counter = 0;


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        counter++;
    }

    public Circle(double radius) {
        this(radius, DEFAULT_COLOR);
    }

    public Circle() {
        this(0, DEFAULT_COLOR);
    }

    public static int getCounter() {
        return counter;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
