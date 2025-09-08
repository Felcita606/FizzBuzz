package lab1;

public class Multiples {
    public static void main(String[] args) {
        for (int count = 1; count <= 1000; count++) {
            multiples(count);
        }
    }

    private static void multiples(int count) {
        if (count % 3 == 0 || count % 5 == 0) {
            System.out.println(count);
        }
    }
}
