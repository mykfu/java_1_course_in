package ru.kpfu.classwork.Lesson_18;

public class Test {
    public static void Foo() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }

    public static void magicNumber(int m) throws Exception, MyException {
        if (m == 8) throw new Exception("It is magic number 8!");
        if (m == 5) throw new MyException("It is magic number 5!");
        System.out.println("It is NOT magic number!");
    }

    public static void main(String[] args) {

        int m = 0;
        try {
            m = 5;
            magicNumber(10);
            magicNumber(m);
            System.out.println("before foo in try");
            Foo();
            System.out.println("after foo in try");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
            System.out.println(ex.getMessage());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }
        System.out.println(m);
        System.out.println("After.");
    }
}
