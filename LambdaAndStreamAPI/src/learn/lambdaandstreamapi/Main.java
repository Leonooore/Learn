package learn.lambdaandstreamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1, "User1");
        map.put(2, "User2");
        map.put(3, "User3");
    }

    private static List<User> users = new ArrayList<>();

    static {
        User user1 = new User(1, "Daniel", 23, "man");
        User user2 = new User(2, "Alexa", 35, "woman");
        User user3 = new User(3, "John", 17, "man");
        User user4 = new User(4, "Kaleb", 25, "man");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    static List<User> getUsersByAgeRangeAndSex(int bottomAge, int topAge, String sex) {
        List<User> userByAgeAndSex = users.stream()
                .filter((p) -> p.getAge() > bottomAge && p.getAge() < topAge && p.getSex().equals(sex))
                .collect(Collectors.toList());
        return userByAgeAndSex;
    }

    static double GetMenAgeAverage() {
        return users.stream().filter((p) -> p.getSex().equals("man")).mapToInt(User::getAge).average().getAsDouble();
    }

    public static int findCountOfWorkingPeople() {
        return (int) users.stream()
                .filter((p) -> p.getAge() >= 18)
                .filter((p) -> (p.getSex().equals("woman") && p.getAge() < 55) || (p.getSex().equals("man") && p.getAge() < 60))
                .count();
    }

    public static List<User> removeUser(User user) {
        users.removeIf(i -> i.equals(user));
        return users;
    }

    public static void main(String[] args) {
        map.forEach((k, v) -> System.out.println(k + " - " + v));

        System.out.println("Count chars in abc4 = " + "abc4".chars().count());

        int[] arr = {3, 5};
        System.out.println("Avarage of array {3, 5} = " + Arrays.stream(arr).average());

        System.out.println("Get Users By Age Range And Sex: " + getUsersByAgeRangeAndSex(21, 30, "man"));
        System.out.println("Get Men Age Average: " + GetMenAgeAverage());
        System.out.println("Find Count Of Working People: " + findCountOfWorkingPeople());
        System.out.println("Remove User: " + removeUser(users.get(1)));
    }
}
