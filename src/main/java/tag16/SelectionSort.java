package tag16;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int @NotNull [] array) {

        int arrayGrosse = array.length;

        for (int i = 0; i < arrayGrosse - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arrayGrosse; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void selectionSortOptimized(int @NotNull [] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int minIndex = left;
            int maxIndex = left;

            for (int i = left + 1; i <= right; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            if (minIndex != left) {
                swap(array, left, minIndex);
                if (maxIndex == left) {
                    maxIndex = minIndex;
                }
            }

            if (maxIndex != right) {
                swap(array, right, maxIndex);
            }

            left++;
            right--;
        }
    }

    private static void swap(int @NotNull [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSortRecursive(int @NotNull [] array, int startIndex) {

        if (startIndex >= array.length - 1) {
            return;
        }

        int minIndex = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        if (minIndex != startIndex) {
            swap(array, startIndex, minIndex);
        }

        selectionSortRecursive(array, startIndex + 1);
    }


    public static void selectionSortStrings(String @NotNull [] array) {

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                String temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void selectionSortVisualized(int[] array) {
        System.out.println("Start Array " + Arrays.toString(array));
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("\n--- Durchgang " + (i + 1) + " ---");
            System.out.println("Suchen Sie den kleinsten Wert im Unterarray [" + i + "..." + (n - 1) + "]");

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    System.out.println("  Neues Minimum gefunden: array[" + j + "] = " + array[j]);
                }
            }

            System.out.println("Minimal Element: array[" + minIndex + "] = " + array[minIndex]);

            if (minIndex != i) {
                System.out.println("tauschen die Plätze in array[" + i + "]=" + array[i] +
                        " und array[" + minIndex + "]=" + array[minIndex]);
                swap(array, i, minIndex);
            } else {
                System.out.println("Das Minimum ist bereits vorhanden, kein Austausch erforderlich.");
            }

            System.out.println("Aktueller Status: " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        System.out.println("=== BASIC Selection Sort ===");
        int[] arr1 = {64, 25, 12, 22, 11};
        String vorDemSort = "Vor dem Sortieren: ";
        String nachDemDort = "Nach dem Sortieren:";
        System.out.println(vorDemSort + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println(nachDemDort + " " + Arrays.toString(arr1));

        System.out.println("\n=== OPTIMIERTE Version (min/max) ===");
        int[] arr2 = {64, 25, 12, 22, 11};
        System.out.println(vorDemSort + Arrays.toString(arr2));
        selectionSortOptimized(arr2);
        System.out.println(nachDemDort + " " + Arrays.toString(arr2));

        System.out.println("\n=== РЕКУРСИВНАЯ версия ===");
        int[] arr3 = {64, 25, 12, 22, 11};
        System.out.println(vorDemSort + Arrays.toString(arr3));
        selectionSortRecursive(arr3, 0);
        System.out.println(nachDemDort + " " + Arrays.toString(arr3));

        System.out.println("\n=== Selection Sort für Zeichenfolgen ===");
        String[] words = {"banana", "apple", "cherry", "date", "blueberry"};
        System.out.println(vorDemSort + Arrays.toString(words));
        selectionSortStrings(words);
        System.out.println(nachDemDort + " " + Arrays.toString(words));

        System.out.println("\n=== VISUALISIERUNG des Prozesses ===");
        int[] arr4 = {64, 25, 12, 22, 11};
        selectionSortVisualized(arr4);
    }
}
