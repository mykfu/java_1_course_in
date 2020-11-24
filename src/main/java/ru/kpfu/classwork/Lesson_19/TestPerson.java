package ru.kpfu.classwork.Lesson_19;

import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {
        String filename = "src/main/java/ru/kpfu/classwork/Lesson_19/MOCK_DATA.csv";

        PersonCSVDAO dao = new PersonCSVDAO(filename);

        for (Person person : dao.readAll()) {
            System.out.println(person);
        }

        try {
            Person pers = dao.read(5);
            System.out.println(pers);
            pers.setFirst_name("Ivan");
            dao.update(pers);
            dao.saveAs("src/main/java/ru/kpfu/classwork/Lesson_19/MOCK_DATA2.csv");

            System.out.println("Search in first_name:");
            System.out.println(Arrays.toString(dao.findBy("Dew", "first_name")));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
