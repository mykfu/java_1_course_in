package ru.kpfu.classwork.Lesson_17;

public class Drakon extends Monster {

    public Drakon(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Fire!");
    }
}
