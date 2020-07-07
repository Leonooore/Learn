package learn.oop.part2;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 2, "Black", new Engine("Renault", 8000));
        System.out.println(mercedes.getName());
        System.out.println("Engine Model: " + mercedes.getEngine().getModel());
    }
}
