package tag10;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class LottoSpiel {
    public static void main(String[] args) {
        Random random = new Random();

        int[] userNumbers = generateLottoNumbers(random);
        System.out.println("Generierte Zahlen für den Lottoschein:");
        System.out.print("Ihre Zahlen: ");
        printArray(userNumbers);
        System.out.println("\nWir beginnen mit der Simulation...\n");

        int versuch = 0;
        boolean isGewinnschein = false;
        int[] gewinnschein = new int[6];

        while (!isGewinnschein) {
            versuch++;

            int[] computerNumbers = generateLottoNumbers(random);

            int uebereinstimmungZahl = countMatches(userNumbers, computerNumbers);

            if (versuch % 500_000 == 0) {
                System.out.println("Versuch " + versuch + " : " + uebereinstimmungZahl + " Übereinstimmungen gefunden");
            }

            if (uebereinstimmungZahl == 6) {
                isGewinnschein = true;
                gewinnschein = cloneGewinnschein(computerNumbers);
            }
        }

        System.out.println("\n====================================");
        System.out.println("HERZLICHEN GLÜCKWUNSCH! SIE HABEN GEWONNEN!");
        System.out.println("====================================\n");
        System.out.print("Ihre Zahlen: ");
        printArray(userNumbers);
        System.out.print("\nGewinnkombination: ");
        printArray(gewinnschein);
        System.out.println("\nEs waren mehrere Versuche erforderlich: " + versuch);

        double ticketPrice = 2.10;
        double totalCost = versuch * ticketPrice;

        System.out.printf("%nPreis für ein Lotterieticket: %.2f €%n", ticketPrice);
        System.out.printf("Gesamtausgaben: %.2f €%n", totalCost);

        System.out.printf("%nWeitere Informationen:%n");
        System.out.printf("Millionen Versuche: %.2f Mio.%n", versuch / 1_000_000.0);
        System.out.printf("Ausgegebener Betrag in Millionen: %.2f Mio. €%n", totalCost / 1_000_000.0);
    }

    /**
     * Methode zur Generierung von 6 eindeutigen Lottozahlen
     *
     * @param random generator
     * @return int Array
     */
    public static int[] generateLottoNumbers(Random random) {
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            int nummer;
            boolean isDuplicate;

            do {
                nummer = random.nextInt(49) + 1;
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == nummer) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            numbers[i] = nummer;
        }

        bubbleSort(numbers);
        return numbers;
    }

    /**
     * Methode zum Zählen von Übereinstimmungen zwischen zwei Arrays
     *
     * @param arr1 erste Array
     * @param arr2 zweite Array
     * @return Anzahl der Übereinstimmungen
     */

    public static int countMatches(int @NotNull [] arr1, int[] arr2) {
        int matches = 0;

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                matches++;
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return matches;
    }

    /**
     * Bubble-Sortierverfahren
     *
     * @param arr array, der sortiert soll
     */
    public static void bubbleSort(int @NotNull [] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Methode zum Drucken eines Arrays
     *
     * @param arr Druckarray
     */
    public static void printArray(int @NotNull [] arr) {
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%2d", arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }

    private static int[] cloneGewinnschein(int[] gewinnschein) {
        int[] resultArray = new int[gewinnschein.length];

        for (int i = 0; i < gewinnschein.length; i++) {
            resultArray[i] = gewinnschein[i];
        }

        return resultArray;
    }
}