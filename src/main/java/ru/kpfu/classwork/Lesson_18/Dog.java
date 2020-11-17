package ru.kpfu.classwork.Lesson_18;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;

    public Dog(String name) {
        this.name = name;
        isCollarPutOn = false;
        isLeashPutOn = false;
    }

    public void putCollar() {
        System.out.println("Ошейник надет.");
        isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет.");
        isLeashPutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if(isLeashPutOn && isCollarPutOn) {
            System.out.println(name + " is walking.");
        } else {
            throw new DogIsNotReadyException(name + " is not ready. " + (isCollarPutOn ? "" : "No collar. ") +
                    (isLeashPutOn ? "" : "No leash. "));
        }
    }

    public static void main(String[] args) {
        Dog beth = new Dog("Beethoven");
        beth.putCollar();
        beth.putLeash();
        try {
            beth.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
        }

        Dog tuzik = new Dog("Tuzik");
        try {
            tuzik.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
        }

        Dog sharik = new Dog("Sharik");
        try {
            sharik.putLeash();
            sharik.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
        }
    }

}

class DogIsNotReadyException extends RuntimeException {

    public DogIsNotReadyException(String message) {
        super(message);
    }
}