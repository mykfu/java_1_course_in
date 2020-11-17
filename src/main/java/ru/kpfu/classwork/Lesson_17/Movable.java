package ru.kpfu.classwork.Lesson_17;

public interface Movable {
    void moveUp(double x);
    void moveDown(double x);
    void moveLeft(double x);
    void moveRight(double x);

    default void print(){
        System.out.println("default print");
    }
}
