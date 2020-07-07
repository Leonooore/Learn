package learn.oop;

public class Main {

    public static void main(String[] args) {
        Bird phoenix = new Bird("Lara", "golden", 2, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("phoenix food");
        phoenix.fly();
        phoenix.fly(400);
    }
}
