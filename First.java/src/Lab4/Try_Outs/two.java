package Lab4.Try_Outs;

public class two {
    public static void main(String[] args) {
        System.out.println(foo(7, 19));
    }

    public static int bar(int x, int y, int z) {
        return x + y - z;
    }

    public static int foo(int x, int y) {
        return bar(x, y, x + y);
    }
}
/*
 * The output is 0.
 * As here we are calling foo(7,19).
 * Then it calls bar(7,19,26)
 * in that function it return 7+19-26, which is zero.
 */
