package learn.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Student ArrayList---");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ann", 11));
        students.add(new Student("Kevin", 28));
        for (Student s: students){
            System.out.print("id: " + s.getId());
            System.out.println("\tname: " + s.getName());
        }

        /*ArrayList*/
        ArrayList<String> names = new ArrayList<>();
        System.out.println("\n---ArrayList---");
        System.out.println("Enter the names into ArrayList: ");
        for (int i = 0; i < 5; i++) {
            names.add(scanner.next());
        }
        System.out.println("Get ArrayList of names: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Enter a name to remove: ");
        String rName = scanner.next();
        System.out.println("The index of removing name - " + names.indexOf(rName));
        names.remove(rName);
        System.out.println("ArrayList of names after removing: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("Does the ArrayList contains removing name? - " + names.contains(rName));
        names.clear();
        System.out.println("The ArrayList was cleared");
        System.out.println("ArrayList is Empty? - " + names.isEmpty());

        /*Map*/
        System.out.println("\n---Map---");
        Map<String, String> emailList = new HashMap<>();
        String name, email;
        System.out.println("Enter name and email into Map:");
        for(int i = 0; i < 2; i++){
            System.out.println("Enter name: ");
            name = scanner.next();
            System.out.println("Enter email: ");
            email = scanner.next();
            emailList.put(name, email);
        }
        System.out.println("Enter a name to get the email:");
        String getEmail = scanner.next();
        System.out.println(emailList.get(getEmail));
        System.out.println("Enter a name to remove info: ");
        String remName = scanner.next();
        emailList.remove(remName);
        System.out.println("Does the email list contain removing element by Key? - " + emailList.containsKey(remName));
        System.out.println("Size of email list: " + emailList.size());
        emailList.clear();
        System.out.println("The email list was cleared");
        System.out.println("Does the email list is Empty? - " + emailList.isEmpty());
    }
}
