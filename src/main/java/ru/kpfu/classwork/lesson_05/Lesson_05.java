package ru.kpfu.classwork.lesson_05;

public class Lesson_05 {
    public static void main(String[] args) {
        int [] anArray = new int[10];

        int m = 3, n = 4;
        int [][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                matrix[i][j] = (int)(Math.random() * 201) - 100;
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int [][][] cube = new int[m][m][m];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            System.out.printf("%3d", matrix[i][1]);
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            System.out.println("sum of " + i + " = " + sum);
        }

        for (int i = 0; i < n; i++) {
//            int max = -100;
//            int max = Integer.MIN_VALUE;
            int max = matrix[0][i];
            for (int j = 1; j < m; j++) {
                if (max < matrix[j][i]) {
                    max = matrix[j][i];
                }
            }
            System.out.printf("max of %d col is %d.%n", i + 1, max);
        }

        int rowsCount = 0;
        for (int i = 0; i < m; i++) {
            boolean f = false;
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] == matrix[i][k]){
                        f = true;
                    }
                }
            }
            if (!f) rowsCount++;
        }
        System.out.println("rowsCount = " + rowsCount);

        
    }
}
