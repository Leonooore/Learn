package learn.example.DeveloperExample;

public class Developer {
    /**
     * This is attributes of developer
     */
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;
    private int experience;
    private int salary;


    /**
     * This is constructor
     */
    public Developer(int id, String firstName, String lastName, String specialty, int experience, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.experience = experience;
        this.salary = salary;
    }

    /**
     * Getters and Setters - designed to get or set values of developer's attributes
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Behaviour of the developer
     */

    public void writeCode() {
        System.out.println("Developer is writing code...");
    }

    public void getDepressed() {
        System.out.println("Developer is depressed due to difficult bag in his program.");
    }

    public void solveProblem() {
        System.out.println("Developer is solving problem...");
        System.out.println("Problem solved.");
    }

    public void enjoyTheLife() {
        System.out.println("Finally, developer solved the problem and now he is rejoicing...");
    }

    @Override
    public String toString() {
        return "===================\n" +
                "Developer" +
                "\nid: " + id +
                "\nFirst Name='" + firstName +
                "\nLast Name: " + lastName +
                "\nSpecialty: " + specialty +
                "\nExperience: " + experience +
                "\nSalary: " + salary + "\n" +
                "===================\n";
    }
}
