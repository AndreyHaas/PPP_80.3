package tag16;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {

    public static void bubbleSortBasic(int @NotNull [] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int @NotNull [] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int @NotNull [] array) {

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Originales Array:");
        printArray(arr);

//        bubbleSortOptimized(arr);
        bubbleSortBasic(arr);

        System.out.println("Sortiertes Array:");
        printArray(arr);
    }
}