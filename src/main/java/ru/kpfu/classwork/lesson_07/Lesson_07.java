package ru.kpfu.classwork.lesson_07;

import java.util.Arrays;

public class Lesson_07 {

    public static void main(String[] args) {
        double[] realNumbers = new double[5]; // from 0 to size - 1

        System.out.println(realNumbers[0]);
//        realNumbers[realNumbers.length - 1] // last
        for (int i = 0; i < realNumbers.length; i++) {
            realNumbers[i] = i + 1;
        }

        for (int i = 0; i < realNumbers.length; i++) {
            System.out.print(realNumbers[i] + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(realNumbers));

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numbers));

        int count = 0;
        boolean wasLastElementLess = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                if (!wasLastElementLess) count++; // wasLastElementLess == false
                wasLastElementLess = true;
            } else {
                wasLastElementLess = false;
            }
        }
        System.out.println("count = " + count);

        int a = 5, b = 10;
        int t = a;
        a = b;
        b = t;

        int[] arr1 = {1, 3, 2, 4, 5}; // 2, 4, 5, 1, 3
        int[] arr2 = {5, 4, 3, 2, 1};

        System.out.println("Swap arrays:");
        System.out.println("Before:");
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            t = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = t;
        }

        System.out.println("After:");
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("Cicle left 2:");
        int k = 2;

        t = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i - 1] = arr1[i];
        }
        arr1[arr1.length-1] = t;
        System.out.println("arr1 = " + Arrays.toString(arr1));

        int[] arr3 = new int[arr1.length];
        int j = 0;
        for (int i = k; i < arr1.length; i++) {
            arr3[j] = arr1[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            arr3[j] = arr1[i];
            j++;
        }
        System.out.println("arr3 = " + Arrays.toString(arr3));




    }
}
