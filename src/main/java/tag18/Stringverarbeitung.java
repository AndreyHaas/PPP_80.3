package tag18;

import java.util.Arrays;

public class Stringverarbeitung {
    public static void main(String[] args) {
        String[] sArray = new String[]{"Java", "ist super!"};
        System.out.println("Kontrollausgabe des String-Arrays: ");
        System.out.println(Arrays.toString(sArray));

        String beispiel = "Beispiel";

        System.out.printf("Posotion von 's' ist: %d", beispiel.indexOf('s'));
    }
}
