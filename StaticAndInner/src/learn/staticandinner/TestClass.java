package learn.staticandinner;

public class TestClass {
    public static String name;
    private int age;
    private String nationality;

    public TestClass(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public static void printSmth() {
        System.out.println("Smth...");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
