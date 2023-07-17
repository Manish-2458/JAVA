package JavaAssignments.AS7;

abstract class Shape1{
    String color;
    abstract double area();
    /*abstract String tostring();*/

    String getColor() {
        return null;
    }
    abstract double perimeter();
}
class Circle1 extends Shape1{
    double radius;
    double Area,Perimeter;
    Circle1(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    @Override
    double area() {
        this.Area=3.14*radius*radius;
        return Area;
    }
    double perimeter() {
        this.Perimeter=2*3.14*radius;
        return Perimeter;
    }
    /*@Override
    String tostring(){
        System.out.println("Circle Area:"+Area);
        return null;
    }*/
    String getcolor(){
        System.out.println("Circle Color:"+color);
        return null;
    }

}
class Rectangle1 extends Shape1{
    double length,width;
    double Area,Perimeter;
    Rectangle1(double length,double width,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }
    @Override
    double area() {
        this.Area=length*width;
        return Area;
    }
    double perimeter() {
        this.Perimeter=2*(length+width);
        return Perimeter;
    }
    /*@Override
    String tostring(){
        System.out.println("Rectangle Area:"+Area);
        return null;
    }*/
    String getcolor(){
        System.out.println("Rectangle Color:"+color);
        return null;
    }

}
public class _5 {
    public static void main(String[] args) {
        Circle1 ob=new Circle1(5,"red");
        Rectangle1 ob1=new Rectangle1(5,5,"blue");
        ob.getcolor();
        System.out.println("Area of Circle:"+ob.area());
        System.out.println("Perimeter of Circle:"+ob.perimeter());
        ob1.getcolor();
        System.out.println("Area of Rectangle:"+ob1.area());
        System.out.println("Perimeter of Rectangle:"+ob1.perimeter());
    }
}
