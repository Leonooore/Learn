package learn.singletonpattern;

public class DataBase {
    private String name;

    private static DataBase instance;

    public static synchronized DataBase getInstance(String name) {
        if (null == instance) {
            instance = new DataBase(name);
        }
        return instance;
    }

    private DataBase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "DataBase class\n" +
                "Name: " + this.name;
        return text;
    }
}
