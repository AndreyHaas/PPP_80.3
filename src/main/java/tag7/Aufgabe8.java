package tag7;

import java.util.Arrays;

public class Aufgabe8 {
    public static void main(String[] args) {
        int[] array = {15, 42, 23, 8, 4, 16, 42, 15, 23, 42};
        sortiereArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Durchschnitt: " + berechneDurchschnitt(array));
        System.out.println("Median von array: " + berechneMedian(array));
        System.out.println("Wert ist" + bollToString(istWertEnthalten(array, 4)) + " vorhanden!");
        System.out.println("Max in array is: " + findeMax(array));
        System.out.println("Min in array is: " + findeMin(array));
    }

    static void sortiereArray(int[] array) {
        Arrays.sort(array);
    }

    static double berechneDurchschnitt(int[] array) {
        int summe = 0;
        for (int wert : array) {
            summe += wert;
        }
        return (double) summe / array.length;
    }

    static double berechneMedian(int[] array) {
        if (array.length % 2 == 1) {
            return array[array.length / 2];
        } else {
            int mitte1 = array[(array.length / 2) - 1];
            int mitte2 = array[array.length / 2];
            return (mitte1 + mitte2) / 2.0;
        }
    }

    static boolean istWertEnthalten(int[] array, int wert) {
        boolean isVorhanden = false;
        for (int i : array) {
            if (i == wert) {
                isVorhanden = true;
                break;
            }
        }

        return isVorhanden;
    }

    static int findeMax(int[] array) {
        sortiereArray(array);
        return array[array.length - 1];
    }

    static int findeMin(int[] array) {
        sortiereArray(array);
        return array[0];
    }

    static String bollToString(boolean wert) {
        return wert ? "" : " nicht";
    }
}
