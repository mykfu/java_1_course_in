package ru.kpfu.classwork.lesson_04;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

public class Lesson_04 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 4; i++) {
            if (i == 2) continue;
            System.out.println(i);
        }
        for (int i = 0; i < 4; i++) {
            if (i == 2) break;
            System.out.println(i);
        }
        int k = 4;
        do {
            System.out.println("k = " + k);
            k--;
        } while (k > 5);

//        int i= 10, j = 11, j1 = 12;

        int[] arr = new int[10];
        int[] arr2;
        int[] arr3 = {4, 3, 2, 1};

        // type[] name = new type[size];

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("for-each");
        for (int current : arr) {
            System.out.println(current);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
            else System.out.println();
        }

        int sum = 0;

        for (int cur : arr) {
            sum += cur;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Srednee = " + (double) sum / arr.length);

        k = 20;
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) {
                f = true;
                break;
            }
        }
        if (f)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
