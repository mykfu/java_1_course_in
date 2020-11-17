package ru.kpfu.classwork.Lesson_17;

public class MovablePoint extends Point
        implements Movable, PlateGeometricObject {

    public MovablePoint() {
    }

    public MovablePoint(double x, int y) {
        super(x, y);
    }

    @Override
    public void moveUp(double x) {
        this.y += x;
    }

    @Override
    public void moveDown(double x) {
        this.y -= x;

    }

    @Override
    public void moveLeft(double x) {

    }

    @Override
    public void moveRight(double x) {

    }

    @Override
    public String toString() {
        return "Movable" + super.toString();
    }
}
