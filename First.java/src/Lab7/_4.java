package JavaAssignments.AS7;
abstract class Shape{
    String color;
    abstract double area();
    /*abstract String tostring();*/

    String getColor() {
        return null;
    }
}
class Circle extends Shape{
    double radius;
    double Area;
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    @Override
    double area() {
        this.Area=3.14*radius*radius;
        return Area;
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
class Rectangle extends Shape{
    double length,width;
    double Area;
    Rectangle(double length,double width,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }
    @Override
    double area() {
        this.Area=length*width;
        return Area;
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
public class _4 {
    public static void main(String[] args) {
        Circle ob=new Circle(5,"red");
        Rectangle ob1=new Rectangle(5,5,"blue");
        ob.getcolor();
        System.out.println("Area of Circle"+ob.area());
        ob1.getcolor();
        System.out.println("Area of Rectangle"+ob1.area());
    }
}
