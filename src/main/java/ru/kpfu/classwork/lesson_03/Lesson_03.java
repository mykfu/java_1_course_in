package ru.kpfu.classwork.lesson_03;

public class Lesson_03 {

    public static void main(String[] args) {
        System.out.println("message");
        System.out.println("message");
        System.out.println("message");
        System.out.println("message");


        // init; test; update
        for(int i = 1; i <= 4; i++) {
            System.out.println("message");
        }

        for (int i = -3; i <= 5 / 2; i++) {
//            System.out.println(i * 1.8 + 32);
            System.out.printf("%dC = %.2fF\n", i, (i * 1.8 + 32));
            // %5d - int
            // %3.3f - float
            // %s - string
        }

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("For10.");
        double sum = 0;
        int m = 5;
        for (int i = 1; i <= m; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("sum = %.2f%n", sum);

        System.out.println("For19. Factorial");
        long factorial = 1;

        for (int i = 2; i <= m; i++) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d is %d.%n", m, factorial);

        System.out.println("For21. Sum of 1/n!.");
        double exp = 1;
        factorial = 1;
        for (int i = 1; i <= m; i++) {
            factorial *= i;
            exp += 1.0 / factorial;
        }
        System.out.printf("Exp = %.5f%n", exp);


        System.out.println("For36.");

        // 15^5
        int power = 1;
        for (int i = 1; i <= 5; i++) {
            power *= 15;
        }

        System.out.printf("15^5=%d%n", power);

        n = 2;
        int k = 3;
        power = 1;
        sum = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                power *= i;
            }
            sum += power;
            power = 1;
        }

        System.out.println("Ans: " + sum);

        int iter = 5;
        while (iter >= 0) {
            System.out.println(iter);
            iter--;
        }

        int a = 11, b = 3;

        while (a >= b) {
            a = a - b;
        }
        System.out.println("a = " + a);


        System.out.println("While3.");
        // (int)(n / k), n % k
        n = 10;
        k = 3;
        int ans = 0;
        while (n >= k) {
            n -= k;
            ans++;
        }

        System.out.printf("Ans: %d, %d.%n", ans, n);


    }

}
