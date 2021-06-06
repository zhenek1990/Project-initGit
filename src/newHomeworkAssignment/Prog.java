package newHomeworkAssignment;

import newHomeworkAssignment.people.*;
import newHomeworkAssignment.people.UserBase;

import java.util.*;
import java.util.stream.Collectors;

public class Prog {

    UserBase humans;


    public Prog() {

        humans = new UserBase();


    }


    public void go() {
        List<User> allHumans = humans.allUser();

        // список только пользователей
        System.out.println("Перечень только пользователей : \n");
        List<User> userOnly = allHumans.stream()
                .filter(v -> !(v instanceof Employee)).collect(Collectors.toList());

        userOnly.forEach(System.out::println);
        System.out.println();

        //   Средний возраст всех пользователей
        OptionalDouble middleAge = allHumans.stream().mapToInt(User::getAGE).average();
        System.out.println("Средний возраст всех пользователей - " + (int) middleAge.getAsDouble() + " лет\n");

        //   Средний возраст до 18 лет
        OptionalDouble averageAgeUnder18 = allHumans.stream().filter(v -> v.getAGE() < 18)
                .mapToInt(User::getAGE).average();

        System.out.println("Средний возраст до 18 лет - " + (int) averageAgeUnder18.getAsDouble() + " лет\n");


        // список только работников
        List<Employee> employeeList = allHumans.stream().filter(val -> val instanceof Employee)
                .map(v -> (Employee) v).collect(Collectors.toList());

        final Map<String, List<Employee>> positionListMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getPOSITION));

        //   - Получить средний оклад на отдел;


        // список у кого почта @gmail.com
        List<User> usersMailGmail = allHumans.stream().filter(val -> val.getMAIL().equalsIgnoreCase(Mail.GMAIL.val))
                .collect(Collectors.toList());

        System.out.println("список у кого почта @gmail.com");
        for (User user : usersMailGmail) {
            System.out.println(user.toString());
        }
//        usersMailGmail.forEach(System.out::println);
        System.out.println();




    }
}
