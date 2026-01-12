package tag18;

public class NamenAufbereiten {
    public static void main(String[] args) {

        String[] dbAusgabe = {" Frost, Nikolaus ", " Montag, Boris-Wilhelm", "Schlaf, maximilian"};

        for (String data : dbAusgabe) {
            String[] splitsString = data
                    .trim()
                    .toUpperCase()
                    .split(", ");

            String nachName = splitsString[0];
            String vorName  = splitsString[1];

            System.out.printf("Vorname:  \t%s%n", vorName);
            System.out.printf("Nachname: \t%s%n", nachName);
            System.out.printf("Adresse:  \t%s%n%n", vorName + " " + nachName);
        }
    }
}
