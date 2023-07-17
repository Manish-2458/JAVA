package Lab9;

public class q1 {

    public static void main(String[] args) {
        int[] array;

        try {
            array = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size exception: " + e.getMessage());
        }

        System.out.println("Continue execution");
    }
}