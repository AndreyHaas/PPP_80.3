package tag16;

import org.jetbrains.annotations.NotNull;

/*
AUFGABE: Grundlegende statistische Analyse eines Arrays
ZIEL:
Erstellen Sie ein Programm, das eine statistische Analyse eines Arrays von Ganzzahlen durchführt.

ANFORDERUNGEN:
Erstellen Sie ein Array von Ganzzahlen mit mindestens 10 Elementen. Beispiel: {15, 42, 23, 8, 4, 16, 42, 15, 23, 42}.

Implementieren Sie die folgenden statischen Methoden:

void sortiereArray(int[] array): Sortiert das gegebene Array.
double berechneDurchschnitt(int[] array): Berechnet und gibt den Durchschnittswert der Elemente im Array zurück.
double berechneMedian(int[] array): Berechnet und gibt den Median des Arrays zurück. Beachten Sie, dass das Array vorher sortiert sein muss.
boolean istWertEnthalten(int[] array, int wert): Überprüft, ob ein bestimmter Wert (z.B. 42) im Array enthalten ist, und gibt das Ergebnis als boolean zurück.
int findeMax(int[] array) : Sucht den maximalen Wert im Array und gibt diesen zurück.
int findeMin(int[] array) : Sucht den minimalen Wert im Array und gibt diesen zurück.

Führen Sie folgende Operationen im main-Programm durch:

Sortieren Sie das Array und geben Sie das sortierte Array aus.
Berechnen und geben Sie den Durchschnittswert der Elemente im Array aus.
Berechnen und geben Sie den Median des Arrays aus.
Überprüfen Sie, ob der Wert 42 im Array enthalten ist, und geben Sie das Ergebnis aus.
Finden Sie den maximal Wert im Array und geben Sie diesen aus.
Finden Sie den minimal Wert im Array und geben Sie diesen aus.
 */

public class ArrayAnalyze {
    public static void main(String[] args) {
        int[] array = {15, 42, 23, 8, 4, 16, 42, 15, 23, 42};
        sortiereArray(array);
        berechneDurchschnitt(array);
        try {
            berechneMedian(array);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        istWertEnthalten(array, 23);
        findeMax(array);
        findeMin(array);
    }

    public static void sortiereArray(int @NotNull [] array) {
        int arrayLength = array.length;
        boolean swapped;

        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;

            for (int j = 0; j < arrayLength - i - 1; j++) {
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

    public static double berechneDurchschnitt(int @NotNull [] array) {
        int summ = 0;

        for (int zahl : array) {
            summ += zahl;
        }

        double durchSchnitt = (double) summ / array.length;

        System.out.printf("Durchschnittswert: %.2f%n", durchSchnitt);

        return durchSchnitt;
    }


    public static double berechneMedian(int[] array) {
        if (!isSorted(array)) {
            throw new IllegalArgumentException("Der Array muss sortiert sein!");
        }

        int length = array.length;

        double result;

        if (length % 2 == 1) {
            result = array[length / 2];
        } else {
            int mid1 = array[(length / 2) - 1];
            int mid2 = array[length / 2];
            result = (mid1 + mid2) / 2.0;
        }

        System.out.printf("Der Median liegt bei: %.2f%n", result);

        return result;
    }

    private static boolean isSorted(int @NotNull [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean istWertEnthalten(int @NotNull [] array, int wert) {

        boolean result = false;

        for (int zahl : array) {
            if (zahl == wert) {
                result = true;
                break;
            }
        }

        System.out.printf(result ? "Array enthält den Wert %d.%n" : "Array enthält den Wert %d nicht.%n", wert);

        return result;
    }

    public static int findeMax(int @NotNull [] array) {
        int max = array[0];

        for (int zahl : array) {
            if (zahl > max) {
                max = zahl;
            }
        }

        System.out.printf("Der Höchstwert lautet: %d%n", max);

        return max;
    }

    public static int findeMin(int @NotNull [] array) {

        int min = array[0];

        for (int zahl : array) {
            if (zahl < min) {
                min = zahl;
            }
        }

        System.out.printf("Der Mindestwert lautet: %d%n", min);

        return min;
    }
}