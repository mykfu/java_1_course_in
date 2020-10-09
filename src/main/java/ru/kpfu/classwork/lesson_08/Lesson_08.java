package ru.kpfu.classwork.lesson_08;

import java.util.Arrays;

public class Lesson_08 {

    public static int[] deleteElement(int[] arr, int ind) {
        if (arr.length < 2) {
            System.err.println("Wrong array length!");
            System.exit(0);
        }
        if (ind < 1 || ind > arr.length) {
            System.err.println("Wrong index!");
            System.exit(0);
        }

        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == ind - 1) continue;
            result[j] = arr[i];
            j++;
        }

        return result;
    }

    public static void copyEven(int[] arr) {
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = arr[i - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int ind = 2;
        System.out.println("Before: " + Arrays.toString(arr));
        arr = deleteElement(arr, ind);
        System.out.println("After: " + Arrays.toString(arr));

        System.out.println("Array106.");
        arr = new int[]{3, 7, 8, 6, 0};
        System.out.println("Before: " + Arrays.toString(arr));
        copyEven(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
