package ru.kpfu.classwork.Lesson_12;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Point point2 = new Point(3, 3);
        System.out.println(point.distance(point2));
    }
}
