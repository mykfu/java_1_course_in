package ru.kpfu.classwork.Lesson_19;

public interface PersonDAO {

    boolean create(Person person);

    Person[] readAll();

    Person read(int id);

    boolean update(int id);

    boolean delete(int id);
}
