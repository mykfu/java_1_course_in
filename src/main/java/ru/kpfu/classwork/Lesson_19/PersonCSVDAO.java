package ru.kpfu.classwork.Lesson_19;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class PersonCSVDAO implements PersonDAO {

    public final int MAX_ROWS = 1000;

    private Person[] people;
    private int length;
    private String separator = ",";
    private String[] header;

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
        people[length] = person;
        length++;

        return false;
    }

    public boolean save() {
        return saveAs(filename);
    }

    public boolean saveAs(String filename) {
        this.filename = filename;

//        PrintWriter pw = new PrintWriter(new BufferedWriter(f))

        return false;
    }



    public Person[] readAll() {
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

                people[length] = new Person(Integer.parseInt(row[0]), row[1], row[2], row[3], row[4].equals("Male"),
                        new SimpleDateFormat("dd.MM.yyyy").parse(row[5]), row[6]);
                length++;
                k++;
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        Person[] result = new Person[length];
        result = Arrays.copyOf(people, length);

        return result;
    }

    @Override
    public Person read(int id) throws Exception {
        for (Person person : people) {
            if (person.getId() == id)
                return person;
        }
        throw new Exception("Person not found");
    }

    boolean is_header_exists(String where) {
        for (String current : header) {
            if (current.equals(where)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] findBy(String what, String where) throws Exception {
        if (!is_header_exists(where)) throw new Exception("Header not found!");
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (people[i].getByRowName(where).equals(what)) {
                counter++;
            }
        }
        Person[] founded = new Person[counter];
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (people[i].getByRowName(where).equals(what)) {
                founded[k] = people[i];
                k++;
            }
        }

        return founded;
    }

    @Override
    public boolean update(Person updating) {



        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

}
