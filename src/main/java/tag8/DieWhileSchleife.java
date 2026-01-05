package tag8;

public class DieWhileSchleife {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : array) {
            while (j % 3 == 0) {
                System.out.println(j);
                break;
            }
        }
    }
}
