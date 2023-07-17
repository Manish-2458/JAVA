package Lab4.Try_Outs;

public class one {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        System.out.println("Before swap, x=" + x + " ,y = " + y);
        swap(x, y);
        System.out.println("After swap, x= " + x + ", y = " + y);
    }

    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        return;
    }
}
/*
 * Output
 * Before swap, x=1 ,y = 5
 * After swap, x= 1, y = 5
 */
