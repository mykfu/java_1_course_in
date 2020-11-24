package ru.kpfu.classwork.Lesson_19;

public interface PersonDAO {

    boolean create(Person person);

    Person[] readAll();

    Person read(int id) throws Exception;

    Person[] findBy(String what, String where) throws Exception;

    boolean update(Person updating);

    boolean delete(int id);
}
