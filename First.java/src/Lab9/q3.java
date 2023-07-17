package Lab9;

public class q3 {

    public static void main(String[] args) {
        try {
            int a1 = 23;
            int b1 = 0;
            int c1 = a1 / b1;
            System.out.println("The result is: " + c1);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("This message will definetly be printed");
        }
    }
}