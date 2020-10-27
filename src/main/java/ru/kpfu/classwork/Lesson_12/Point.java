package ru.kpfu.classwork.Lesson_12;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setXY(x,y );
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) *
                (this.x - x) +
                (this.y - y) *
                (this.y - y));
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    public double distance() {
        return distance(0, 0);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
