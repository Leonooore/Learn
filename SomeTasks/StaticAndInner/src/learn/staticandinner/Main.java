package learn.staticandinner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        TestClass.name = scan.next();
        TestClass test = new TestClass(25, "Asian");
        System.out.println("Name: " + test.getName());
        TestClass sTest = new TestClass(21, "Polish");
        System.out.println("Name: " + sTest.getName());
        TestClass.printSmth();
    }
}
