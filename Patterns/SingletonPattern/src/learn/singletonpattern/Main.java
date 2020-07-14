package learn.singletonpattern;

public class Main {

    public static void main(String[] args) {
        DataBase database = DataBase.getInstance("db_books");
        System.out.println(database.toString());
    }
}
