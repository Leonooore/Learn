package learn.example.DevSpec;

public class Developer {
    private Speciality speciality;

    /*Default constructor*/
    public Developer() {
    }

    /*Getter and Setter to get and to set specialty field value*/
    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    /*toString() method to show Developer's info*/
    @Override
    public String toString() {
        return "======================\n" +
                "Developer " +
                "\nSpeciality: " + speciality +
                "\n======================\n";
    }
}
