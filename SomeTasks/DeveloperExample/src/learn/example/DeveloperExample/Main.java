package learn.example.DeveloperExample;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer(1, "Mike", "Lee", "Java", 3, 2500);

        System.out.println("Developer's Info:");
        System.out.println(developer);

        developer.writeCode();
        developer.getDepressed();
        developer.solveProblem();
        developer.writeCode();
        developer.enjoyTheLife();

        System.out.println("That's all...");
    }
}
