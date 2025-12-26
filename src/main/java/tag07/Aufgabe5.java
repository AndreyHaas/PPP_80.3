package tag07;

import java.util.Arrays;
import java.util.Random;
/*
START
  SET temperaturMessungen = 10_000
  SET minSinnTemp = -30
  SET maxSinnTemp = 45

  DEKLARIERE tempSpeicher[temperaturMessungen]

  SET range = maxSinnTemp - minSinnTemp + 1
  SET temperaturGenerator = neuer Random-Generator

  SET maxTemp = minSinnTemp
  SET minTemp = maxSinnTemp
  SET tempSumme = 0

  FOR i = 0 BIS temperaturMessungen - 1
    SET tempTemperatur = temperaturGenerator.nextInt(range) + minSinnTemp

    tempSpeicher[i] = tempTemperatur

    tempSumme = tempSumme + tempTemperatur

    WENN tempTemperatur > maxTemp DANN
      SET maxTemp = tempTemperatur
    ENDE_WENN

    WENN tempTemperatur < minTemp DANN
      SET minTemp = tempTemperatur
    ENDE_WENN
  ENDE_FOR

  AUSGEBE "Temperaturen: " + tempSpeicher

  AUSGEBE "Minimale Temperatur: " + minTemp + "°C"
  AUSGEBE "Maximale Temperatur: " + maxTemp + "°C"

  SET durchschnitt = tempSumme / temperaturMessungen
  AUSGEBE "Durchschnittstemperatur: " + durchschnitt + "°C"
END
 */
public class Aufgabe5 {
    public static void main(String[] args) {
        int temperaturMessungen = 10;
        int minSinnTemp = -30;
        int maxSinnTemp = 45;
        int[] tempSpeicher = new int[temperaturMessungen];
        int range = maxSinnTemp - minSinnTemp + 1;
        Random temperaturGenerator = new Random();

        int maxTemp = minSinnTemp;
        int minTemp = maxSinnTemp;
        int tempSumme = 0;

        for (int i = 0; i < tempSpeicher.length; i++) {
            int tempTemperatur = temperaturGenerator.nextInt(range) + minSinnTemp;
            tempSpeicher[i] = tempTemperatur;
            tempSumme += tempTemperatur;

            if (tempTemperatur > maxTemp) {
                maxTemp = tempTemperatur;
            }

            if (tempTemperatur < minTemp) {
                minTemp = tempTemperatur;
            }
        }

        System.out.println(Arrays.toString(tempSpeicher));

        System.out.println("Minimale Temperatur: " + minTemp + "°C");
        System.out.println("Maximale Temperatur: " + maxTemp + "°C");
        System.out.printf("Durchschnittstemperatur: %.2f°C%n", (double) tempSumme / tempSpeicher.length);
    }
}
