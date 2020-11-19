package ru.kpfu.classwork.Lesson_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class PersonCSVDAO {

    private String filename;

    public PersonCSVDAO(String filename) {
        this.filename = filename;
    }

    public Person[] readAll() {
        String separator = ",";
        String[] header = null;
        final int MAX_ROWS = 1000;
        Person[] people = new Person[MAX_ROWS];
        int rows = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.filename));
            String line = null;
            int k = 0;
            while ((line = br.readLine()) != null) {
                if (line.matches("^SEP=.$") && k == 0) {
                    separator = line.substring(line.length() - 2);
                    k++;
                    continue;
                }
                if (line.startsWith("id") && k <= 1) {
                    header = line.split(separator);
                    k++;
                    continue;
                }

                String[] row = line.split(separator);

                people[rows] = new Person(Integer.parseInt(row[0]), row[1], row[2], row[3].equals("Male"),
                        new SimpleDateFormat("dd.MM.yyyy").parse(row[4]), row[5]);

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

}
