package ru.kpfu.classwork.Lesson_19;

public class TestPerson {
    public static void main(String[] args) {
        String filename = "src/main/java/ru/kpfu/classwork/Lesson_19/MOCK_DATA.csv";

        PersonCSVDAO dao = new PersonCSVDAO(filename);

        for (Person person : dao.readAll()) {
            System.out.println(person);
        }
    }



}
