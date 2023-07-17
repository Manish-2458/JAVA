package Lab5;

import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;
    private int area;
    private int perimeter;

    public Rectangle() {
        length = 0;
        breadth = 0;
        calculateArea();
        calculatePerimeter();
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        calculateArea();
        calculatePerimeter();
    }

    private void calculateArea() {
        area = length * breadth;
    }

    private void calculatePerimeter() {
        perimeter = 2 * (length + breadth);
    }

    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }
}

public class sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of R1:");
        int lengthR1 = scan.nextInt();
        System.out.println("Enter the breadth of R1:");
        int breadthR1 = scan.nextInt();
        Rectangle R1 = new Rectangle(lengthR1, breadthR1);

        System.out.println("Enter the length of R2:");
        int lengthR2 = scan.nextInt();
        System.out.println("Enter the breadth of R2:");
        int breadthR2 = scan.nextInt();
        Rectangle R2 = new Rectangle(lengthR2, breadthR2);

        Rectangle R3 = new Rectangle(); // Default values: length = 10, breadth = 12

        System.out.println("Area and Perimeter of R1:");
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter: " + R1.getPerimeter());

        System.out.println("Area and Perimeter of R2:");
        System.out.println("Area: " + R2.getArea());
        System.out.println("Perimeter: " + R2.getPerimeter());

        System.out.println("Area and Perimeter of R3:");
        System.out.println("Area: " + R3.getArea());
        System.out.println("Perimeter: " + R3.getPerimeter());

        scan.close();
    }
}
