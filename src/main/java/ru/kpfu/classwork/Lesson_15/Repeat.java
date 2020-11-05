package ru.kpfu.classwork.Lesson_15;

import java.util.Arrays;

public class Repeat {


    // x = 1, y = 0 => x = 0, y = 1
    public static void minMax(Integer x, Integer y) {
        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        //x = min
        // y = max
    }
    // x = 0.00001; EPS = 0.0001
    // x = 1
    public static byte sign(double x) {
        final double EPS = 0.0001;
        // |x - x0| < EPS
        if (Math.abs(x - 0) <= EPS) return 0;
        if (x > 0) return 1;
        return -1;
    }

    public static void getTwoMin(int n) {
        if (n <= 2) {
            System.err.println("N must be > 2.");
            System.exit(1);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        // 1, 3, 2
        int min = arr[0]; // 1
        int min2 = arr[0]; // 3
        for (int i = 1; i < n; i++) {
        //arr[i] = 2
            if (arr[i] < min) { // 2 < 1
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
            // min = 1, min2 = 2
        }
        System.out.printf("First min is %d.%n", min);
        System.out.printf("Second min is %d.%n", min2);


    }

    public static boolean isDivThree(int n) {
        // n = 5
        int sum = n;
        while (n / 10 != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 3 == 0;
    }

    public static void main(String[] args) {
        Integer a = new Integer(100); // int
        Double d = new Double("123.12");

        int b = Integer.parseInt("12");

        minMax(a, b);

        System.out.printf("a = %d, b = %d%n", a, b);

        System.out.println(sign(0.00001));
        System.out.println(sign(0.0001));
        System.out.println(sign(0.001));
        System.out.println(sign(-0.001));

        getTwoMin(15);
        System.out.println(isDivThree(3));
        System.out.println(isDivThree(36));
        System.out.println(isDivThree(361));
    }


}
