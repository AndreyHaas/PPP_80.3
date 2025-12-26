package tag04;

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
        String einfuerung = "Geben Sie bitte das ";
        String ende = ". Zeichen ein: ";
        System.out.println(einfuerung + a + ende);
        wt1 = sc.nextLine();

        a += 1;
        System.out.println(einfuerung + a + ende);
        wt2 = sc.nextLine();

        a += 1;
        System.out.println(einfuerung + a + ende);
        wt3 = sc.nextLine();

        System.out.println(wt1);
        System.out.println(wt2);
        System.out.println(wt3);
    }
}
