package Lab5.Try_Outs;

class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Test1 {
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle(); Their is an error in this line as the numbers
        // of parameters is not the same.
        Rectangle r2 = new Rectangle(12, 20);
        Rectangle r3 = new Rectangle(9, 7);
        System.out.println("The perimeter of the rectangle one is:- " + r2.getPerimeter());
        System.out.println("The area of the rectangle one is:- " + r2.getArea());

        System.out.println("The perimeter of the rectangle two is:- " + r3.getPerimeter());
        System.out.println("The area of the rectangle two is:- " + r3.getArea());
    }
}
