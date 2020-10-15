package ru.kpfu.classwork.lesson_09;

import java.util.Scanner;

public class Lesson_09 {

    public static long factorial (long n) {
        if (n < 0) return -1;
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public static boolean isAlliterate(String str1, String str2) {
        return false;
    }

    public static boolean isRhyme(String str1, String str2) {
        if (str2.length() >= 2 &&
                str1.endsWith(str2.substring(str2.length()-2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(3));
//        3 * factorial(2) = 6
//        2 * factorial(1)      = 2
//        factorial(1) = 1
        String str = "Hello, itis!";
        String str2 = "Hello, itis!";
        String str3 = "Hello, " + "itis!";
        System.out.println(str == str2);  // wrong
        System.out.println(str.equals(str2));

        String str4 = new String("Hello, itis!");


        System.out.println(str == str4);
        System.out.println(str.equals(str4));
        System.out.println(str.intern() == str4.intern());
        // str.intern() == str4.intern() <==> str.equals(str4)

        char ch = 'a';
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("itiss"));
        System.out.println(str.indexOf('i', 8));
        String str5 = "";
        System.out.println(str.lastIndexOf('i'));

        String itis = str.substring(str.indexOf('i'), str.length() - 1);
        System.out.println(itis);
        System.out.println(itis.toUpperCase());
        System.out.println(itis.toUpperCase().toLowerCase());
        System.out.println(itis.equals(itis.toUpperCase()));
        System.out.println(itis.equalsIgnoreCase(itis.toUpperCase()));

        String surname = "khaYdarOv";
        System.out.println(surname);
        surname = surname.substring(0, 1).toUpperCase() +
                surname.substring(1).toLowerCase();
        System.out.println(surname);

        System.out.println("Enter name:");
        Scanner console = new Scanner(System.in);
        String name = console.next();
        System.out.println(name);
        System.out.println(itis == name);
        System.out.println(itis.equals(name));
//        console = new Scanner(System.in);
//        String line = console.nextLine();
//        System.out.println(line);

        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("!"));
        System.out.println(str.contains("!"));

        String s1 = "keker";
        String s2 = "eker";
        System.out.println(s1 + " " + s2 + " isRhyme = " + isRhyme(s1, s2));

        String s3 = "asdf";
        for (int i = 0; i < 1000; i++) {
            s3 += i;
        }
        String a = "100";
        System.out.println(a + 5 + 6);

        StringBuffer sb = new StringBuffer(56 + "");
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(a.equals(sb.toString()));
        System.out.println(a.toString().equals(a));

    }
}
