package ru.kpfu.classwork.Lesson_12;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        name = "Unknown";
        email = "";
        gender = 'u';
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
        this.gender = 'u';
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender != 'm' && gender != 'f') System.exit(1);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return gender == 'm';
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
