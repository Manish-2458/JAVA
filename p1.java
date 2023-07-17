import java.util.Scanner;

public class p1 {
    // static void mult(int x) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(x + "*" + i + "=" + x * i);
    // }
    // }

    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Enter a number:- ");
    // int n = scan.nextInt();
    // mult(n);
    // scan.close();
    // }

    // }
    // static int sum(int n) {
    // if (n == 0) {
    // return 0;
    // } else {
    // return n + sum(n - 1);
    // }
    // }

    // FIBONACCI USING RECURSION

    // static int fib(int x) {
    // if (x == 0) {
    // return 0;
    // }
    // if (x == 1) {
    // return 1;
    // } else {
    // return fib(x - 1) + fib(x - 2);
    // }
    // }

    // FIBONACCI USING METHODS

    // static void fib(int x) {
    // int x1 = 0;
    // int x2 = 1;
    // int x3 = x1 + x2;
    // for (int i = 4; i <= x; i++) {
    // x1 = x2;
    // x2 = x3;
    // x3 = x1 + x2;
    // }
    // System.out.println(x3);
    // }

    // FULL FIBONNACI SERIES USING METHODS

    // static void fib(int x) {
    // int x1 = 0;
    // int x2 = 1;
    // int x3 = x1 + x2;
    // System.out.println(x1 + "," + x2 + "," + x3);
    // for (int i = 4; i <= x; i++) {
    // x1 = x2;
    // x2 = x3;
    // x3 = x1 + x2;
    // System.out.println(x3);
    // }
    // }

    // FIBONACCI SEERIES USING RECURSION(FULLLENGTH)

    // static int fib(int x) {
    // if (x == 0) {
    // return 0;
    // }
    // if (x == 1) {
    // return 1;
    // } else {
    // return fib(x - 1) + fib(x - 2);
    // }
    // }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int x = scan.nextInt();
        // System.out.println(sum(x));
        // System.out.println("Enter the value of the nth term :- ");
        // int n = scan.nextInt();
        // for (int i = 0; i <= n; i++) {
        // System.out.println(fib(i));
        // }
        // cylinder c = new cylinder(9, 12);
        // System.out.println(c.getRadius());
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        scan.close();
    }
}

class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// GETTERS AND SETTERS

// class cylinder {
// private int radius;
// private int height;

// public cylinder(int radius, int height) {
// this.radius = radius;
// this.height = height;
// }

// public void setRadius(int radius) {
// this.radius = radius;
// }

// public int getRadius() {
// return radius;
// }

// public void setHeight(int height) {
// this.height = height;
// }

// public int getHeight() {
// return height;
// }
// }