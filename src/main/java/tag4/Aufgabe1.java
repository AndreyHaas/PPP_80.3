package tag4;

import java.util.Properties;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Properties properties = System.getProperties();
        System.out.println(properties);
        properties.setProperty("user.country.format","US");
        System.out.println(properties);


        String a = "1";

        String wt1;
        String wt2;
        String wt3;
        System.out.println("Geben Sie bitte das " + a + ". Zeichen ein: ");
        wt1 = sc.nextLine();

        a += 1;
        System.out.println("Geben Sie bitte das " + a + ". Zeichen ein: ");
        wt2 = sc.nextLine();

        a += 1;
        System.out.println("Geben Sie bitte das " + a + ". Zeichen ein: ");
        wt3 = sc.nextLine();

        System.out.println(wt1);
        System.out.println(wt2);
        System.out.println(wt3);
    }
}
