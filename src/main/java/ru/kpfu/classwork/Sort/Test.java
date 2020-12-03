package ru.kpfu.classwork.Sort;

import java.util.Arrays;

public class Test {

    private static void generateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    private static void swap(int[] arr, int ind1, int ind2) {
        int t = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = t;
    }

    /***
     * O(n^2)
     */
    public static void bubbleSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1 - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }


    /**
     * O(n^2)
     * */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;
            for (int k = i; k < arr.length; k++) {
                if (arr[k] < arr[min_ind]) {
                    min_ind = k;
                }
            }
            swap(arr, i, min_ind);
        }
    }

    /*
    * [5, 33, 50, 46, 4, 23, 59, 74, 59, 68], pivot = 59
    *
    * [5, 33, 50, 46, 4, 23, 59, 74, 59, 68], right pivot = 68
    * [5, 33, 50, 46, 4, 23, 59, 59, 68, 74]
    * [5, 33, 50, 46, 4, 23, 59, 59, 68, 74] left pivot = 23
    * [5, 4, 23, 33, 50, 46, 59, 59, 68, 74]
    *
    *
    * */

    private static int part(int[] arr, int left, int right) {
        int pivot = arr[right];
        int left_inx = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, left_inx);
                left_inx++;
            }
        }
        swap(arr, right, left_inx);

        return left_inx;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pi = part(arr, left, right);
            quickSort(arr, left, pi - 1);
            quickSort(arr, pi + 1, right);
        }
    }

    /**
     * O(n*log(n))
     */
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * O(n)
     */
    public static boolean in_array(int findMe, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (findMe == arr[i]) {
                return true;
            }
        }
        return false;
    }


    /*
     *  99
     * [17, 30, 36, 60, 72, 86, 88, 94, 94, 99]
     *
     *
     * 2^31-1 + (2^31 - 1) / 2 = - (2^31 - 1) / 2 + 1
     */
    public static boolean binarySearch(int findMe, int[] sorted) {
        int left = 0;
        int right = sorted.length - 1;
        while (left <= right) {
//            int middle = (left + right) / 2;
            int middle = left + (right - left) / 2;
            if (sorted[middle] < findMe) {
                left = middle + 1;
            } else if (sorted[middle] > findMe) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        generateArray(arr);
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        generateArray(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        generateArray(arr);
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(99, new int[]{9, 13, 13, 21, 32, 33, 37, 38, 90, 99}));
        System.out.println(Integer.MAX_VALUE / 2);
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE / 2);
    }

}
