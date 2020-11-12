package ru.kpfu.classwork.Lesson_16;

public abstract class Figure {

    protected String color;

    public final static String DEFAULT_COLOR = "white";

    public Figure() {
        this.color = DEFAULT_COLOR;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public abstract String toString();

}
