package ru.kpfu.classwork.Lesson_17;

public class Triangle implements PlateGeometricObject, Colorful {

    protected Point a;
    protected Point b;
    protected Point c;
    protected String color;

    public Triangle() {
    }

    public Triangle(Point a, Point b, Point c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
