public class Temp {
    public static void main(String[] args) {

        int[] zahlen = {1, 2, 3, 4};


        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = zahlen[i] * 2;
        }
        // Ergänze hier die Schleife

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", zahlen[i]);
        }
    }
}
