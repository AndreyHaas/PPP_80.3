package tag07;

import org.jetbrains.annotations.NotNull;

public class Array {

    public static void main(String[] args) {

        String[] begruesung = {"Hallo", "Java!" };
        System.out.println(Array.toString(begruesung));
    }

    public static @NotNull String toString(Object[] a) {
        if (a == null) {
            return "null";
        }

        int max = a.length - 1;
        if (max == -1) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append((a[i]));
            if (i == max) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }
}
