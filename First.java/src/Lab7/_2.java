package JavaAssignments.AS7;
class Animal1 {
    void walk() {
        System.out.println("I am walking");
    }
}
class Bird1 extends Animal1 {
    void fly() {
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am Singing");
    }
}
class Duck extends Bird1{
    void swim(){
        System.out.println("I am swimming");
    }
}
public class _2 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.walk();
        d.fly();
        d.sing();
        d.swim();
    }
}
