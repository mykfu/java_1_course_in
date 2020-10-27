package ru.kpfu.classwork.Lesson_12;

public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
