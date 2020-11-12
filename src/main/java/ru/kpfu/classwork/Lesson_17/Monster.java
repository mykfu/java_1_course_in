package ru.kpfu.classwork.Lesson_17;

public abstract class Monster {

    protected int health;
    protected String name;

    public Monster(String name) {
        this.health = 100;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract void attack();

    public void attack2() {

    }
}
