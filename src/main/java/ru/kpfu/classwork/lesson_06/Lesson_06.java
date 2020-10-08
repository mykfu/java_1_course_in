package ru.kpfu.classwork.lesson_06;

import java.util.Scanner;

public class Lesson_06 {

    public static double getCircleArea(double radius) {
        return radius * radius * Math.PI;
//        System.out.println("Unreachable statement");
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void increment(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static void func(int n) {
        System.out.println(++n);
        func(n);
    }

    public static long factorial(int n) {
        if (n < 0) return -1;
        System.out.print(n);
        if (n == 0 || n == 1) {
            System.out.print(" = ");
            return 1;
        }
        System.out.print(" * ");
        return n * factorial(n - 1);
    }

    public static void reverseLines(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverseLines(input);
            System.out.println(line);
        }
    }

    static int count = 0;
    public static int power2(int a, int n) {
        count++;
        if (n == 0) return 1;
        else return a * power2(a, n - 1);
    }

    public static int power(int a, int n) {
        count++;
        int power;
        if (n == 0) return 1;
        else {
            if (n % 2 == 0) {
                power = power(a, n / 2);
                return power * power;
            } else
                return a * power(a, n - 1);
        }
    }

    public static int power3(int a, int n) {
        count++;
        int power;
        if (n == 0) return 1;
        else {
            if (n % 3 == 0) {
                power = power(a, n / 3);
                return power * power * power;
            } else if (n % 2 == 0) {
                power = power(a, n / 2);
                return power * power;
            }
            return a * power(a, n - 1);
        }
    }

    int fib(int n) {
        if (n < 0) return -1;
        if (n <= 1) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    // madam

//    public static boolean isPalindrome(String str) {
//        if (str.length() < 2) {
//            return true;
//        } else {
//            if (str.charAt(0) == str.charAt(str.length() - 1)) {
////                return isPalindrome(str.substring(1, str.length() - 1))
//            }
//
//        }
//    }

    public static void main(String[] args) {
        System.out.println(getCircleArea(10));
        int a = 100, b = 1050;
        System.out.println(min(a, b));

        int[] arr = {23, 123, 2, 65};
        System.out.println("Before:");
        print(arr);
        System.out.println("After:");
        increment(arr);
        print(arr);
//        func(0);
        System.out.println(factorial(5));
        reverseLines(new Scanner("first\n" +"second\n" + "third"));
        System.out.println("First");
        System.out.println(power2(2, 30));
        System.out.println("count = " + count);
        count = 0;
        System.out.println("Second");
        System.out.println(power(2, 30));
        System.out.println("count = " + count);
        count = 0;
        System.out.println("Third");
        System.out.println(power3(2, 30));
        System.out.println("count = " + count);
    }
}
