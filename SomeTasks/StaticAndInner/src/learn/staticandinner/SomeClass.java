package learn.staticandinner;

public class SomeClass {
    private int age;
    private String color;

    public SomeClass(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public class SomeInnerClass {
        private String name;

        public SomeInnerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age: " + age);
        }
    }




}
