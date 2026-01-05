package tag14;

public class TaschenRechner {
    void zeigeMenue() {
        System.out.println("Bitte wählen Sie Operation:");
        System.out.println("/ - Division");
        System.out.println("* - Multiplikation");
        System.out.println("- - Minus");
        System.out.println("+ - Plus");
        System.out.println("% - Modulo / Rest");
        System.out.println("0 - Beenden");
    }

    void division(int dividend, int divisor) {
        if (divisor == 0) {
            System.out.println("Fehler: Division durch 0 ist nicht möglich!");
        } else {
            System.out.printf("%d / %d = %.2f", dividend, divisor, (double) dividend / divisor);
        }
    }

    void multiplikation(int ersteZahl, int zweiteZahl) {
        System.out.printf("%d * %d = %d", ersteZahl, zweiteZahl, ersteZahl * zweiteZahl);
    }

    void minus(int ersteZahl, int zweiteZahl) {
        System.out.printf("%d - %d = %d", ersteZahl, zweiteZahl, ersteZahl - zweiteZahl);
    }

    void plus(int ersteZahl, int zweiteZahl) {
        System.out.printf("%d + %d = %d", ersteZahl, zweiteZahl, ersteZahl + zweiteZahl);
    }

    void modulo(int dividend, int modul) {
        System.out.printf("%d %% %d = %d", dividend, modul, dividend % modul);
    }

    void umrechnen(char operator, int ersteZahl, int zweiteZahl) {
        switch (operator) {
            case '/' -> division(ersteZahl, zweiteZahl);
            case '*' -> multiplikation(ersteZahl, zweiteZahl);
            case '-' -> minus(ersteZahl, zweiteZahl);
            case '+' -> plus(ersteZahl, zweiteZahl);
            case '%' -> modulo(ersteZahl, zweiteZahl);
        }
    }
}
