package ru.kpfu.classwork.Lesson_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class PersonCSVDAO implements PersonDAO {

    public final int MAX_ROWS = 1000;
    private Person[] people;
    private String separator = ",";

    private String filename;

    public PersonCSVDAO(String filename) {
        this.filename = filename;
         people = new Person[MAX_ROWS];
    }

    public String getFilename() {
        return filename;
    }

    public Person[] getPeople() {
        return people;
    }

    @Override
    public boolean create(Person person) {
        return false;
    }

    public Person[] readAll() {
        String[] header = null;
        int rows = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filename));
            String line = null;
            int k = 0;
            while ((line = br.readLine()) != null) {
                if (line.matches("^SEP=.$") && k == 0) {
                    separator = line.substring(line.length() - 1);
                    k++;
                    continue;
                }
                if (line.startsWith("id") && k <= 1) {
                    header = line.split(separator);
                    k++;
                    continue;
                }

                String[] row = line.split(separator, -1);

                people[rows] = new Person(Integer.parseInt(row[0]), row[1], row[2], row[3], row[4].equals("Male"),
                        new SimpleDateFormat("dd.MM.yyyy").parse(row[5]), row[6]);
                rows++;
                k++;
            }






        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Person[] result = new Person[rows];
        result = Arrays.copyOf(people, rows);

        return result;
    }

    @Override
    public Person read(int id) {

        return null;
    }

    @Override
    public boolean update(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

}
