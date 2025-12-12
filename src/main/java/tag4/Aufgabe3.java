package tag4;

import org.jetbrains.annotations.NotNull;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
        int tag = 0;
        int monat = 0;
        int jahr = 0;

        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Geben Sie Tag ein: ");
            tag = scanner.nextInt();
            System.out.println("Geben Sie Monat ein: ");
            monat = scanner.nextInt();
            System.out.println("Geben Sie Jahr ein: ");
            jahr = scanner.nextInt();
            LocalDate date;
            date = LocalDate.of(jahr, monat, tag);
            System.out.println("✅ DE date: " + date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            System.out.println("✅ US date: " + date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        } catch (DateTimeException ex) {
            System.out.println("❌ Fehler: " + getErrorMessage(jahr, monat, tag, ex));
        }
    }

    private static @NotNull String getErrorMessage(int year, int month, int day, @NotNull DateTimeException e) {

        String message = e.getMessage();

        if (message.contains("Invalid value for DayOfMonth")) {
            return "In Monat " + month + "/" + year + " gibt's kein Tag " + day;
        } else if (message.contains("Invalid value for MonthOfYear")) {
            return "Monat soll von 1 bis 12 sein";
        } else if (message.contains("Invalid value for Year")) {
            return "Jahr außerhalb des zulässigen Bereichs";
        } else if (message.contains("leap")) {
            return "Das angegebene Jahr ist kein Schaltjahr.";
        } else {
            return "Falsches Datum: " + day + "." + month + "." + year;
        }
    }
}