package Turorial;

public class eleventh {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
