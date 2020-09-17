package ru.kpfu.classwork.lesson_02;

import java.util.Scanner;

/**
 * Lesson 2.
 * @author Shamil Khaydarov
 */

public class Lesson_02 {
    final static double G = 9.86;

    public static void main(String[] args) {
        String str = "Hello World";
        double g = Lesson_02.G;
        // type name;
        // type name = 0;
        // type name1 = 0, name2, name3 = name;

        // примитивные типы данных
        // boolean // true : false
        // integers:
        //  byte  (1 byte)
        // short  2
        // int 4
        // long 8


        // float 4 byte
        // double 8 byte

        // char

        int num1 = 100, num2 = 20;

        // +, -, *, /, %
        int sum = num1 + num2;

        System.out.println(sum);

        int num3 = 1;

        sum = sum + num3;
        // ==
        sum += num3; // -=, *=, %=, -=
        sum += 2;
        System.out.println(sum); // 124
//        sum++;  // sum += 1; постфиксный инкремент
        System.out.println(sum++); // 124
        // sum = 125
        System.out.println(++sum);  // 126

        int workingHours;

        // декримент sum--

        final double PI = 3.14;
//        PI = 3.23; - wrong



        if (sum == 126) { // >, <, >=, <=, !=
            System.out.println("sum is 126.");
        }

        // AND: true && true = true, true && false = false, false && false = false
        // OR: true || false = true
        // !true = false
        // !(true && true) = false || false

        if (sum > 100 && sum < 200) {
            System.out.println("sum > 100 and sum < 200");
        } else {
            System.out.println("sum not in range");
        }

        int k = 3;

        if (k == 0) {
            System.out.println("k=0");
        } else if (k == 1) {
            System.out.println("k=1");
        } else if (k == 2) {
            System.out.println("k=2");
        } else {
            System.out.println("not any");
        }

        switch (k) {
            case 0:
                System.out.println("k=0");
                break;
            case 1:
                System.out.println("k=1");
                break;
            case 4:
            case 5:
                System.out.println("4, 5");
                break;
            default:
                System.out.println("any");
        }

        System.out.println("Enter value:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n);


        /*
            Магазин работает с 8 до 17, обед с 12 до 13.
            Пользователь вводит с клавиатуры время, нужно
            вывести на экран "Работет.", если магазин работает.
            Если нет, вывести "Не работает.".
            Если ввести неверные данные, сообщить об этом.
         */

    }
}
