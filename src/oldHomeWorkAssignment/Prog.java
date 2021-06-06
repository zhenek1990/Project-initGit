package oldHomeWorkAssignment;

import newHomeworkAssignment.people.*;

import java.util.ArrayList;

public class Prog {

    ArrayList<User> usersAndEmployees; // общий лист
    ArrayList<User> peopleWithMailGmailMail; // лист для почты @gmail и @mail
    ArrayList<User> mailEmployeesWomen;

    public Prog() {
        mailEmployeesWomen = new ArrayList<>();
        peopleWithMailGmailMail = new ArrayList<>();
        usersAndEmployees = new ArrayList<>();

        usersAndEmployees.add(new User("Иван Иванов", 30, "мужчина", "ivan2021@gmail.com",
                "Украина"));
        usersAndEmployees.add(new User("Марта Мартынова", 28, "женщина", "marta@gmail.com",
                "Украина"));
        usersAndEmployees.add(new User("Петя Петеньков", 17, "мужчина", "petya777@ya.ru",
                "Россия"));
        usersAndEmployees.add(new User("Васелиса Петенькова", 14, "женщина",
                "vaselisa.the.best@mail.ru", "Россия"));
        usersAndEmployees.add(new User("Фёдор Федорчиков", 42, "мужчина",
                "fedor.fedorchikov@rambler.ru", "Украина"));

        usersAndEmployees.add(new Employee("Лариса Ларькина", 26, "женщина",
                "larkina_lara@mail.ru", "Россия",
                1000, "менеджер", "отдел продаж"));
        usersAndEmployees.add(new Employee("Максим Максимов", 23, "мужчина",
                "maksimka111@yandex.ru", "Украина", 800, "Тестировщик",
                "Отдел разработки ПО"));
        usersAndEmployees.add(new Employee("Карина Каривчановна", 22, "Женщина",
                "Karinka787@rambler.ru", "Россия", 900, "Дизайнер",
                "3D-дизайнер"));
        usersAndEmployees.add(new Employee("Светлана Светланько", 31, "Женщина",
                "Svetik228@yandex.ru", "Украина", 600, "Бугалтер",
                "Бугалтерия"));
        usersAndEmployees.add(new Employee("Виталий Переданков", 32, "Мужчина",
                "Zhenek228@gmail.com", "Украина", 1500, "Android-Developer",
                "Отдел разработки ПО"));
        usersAndEmployees.add(new Employee("Ольга Олефандровна ", 28, "Женщина",
                "olechka.ol@gmail.com", "Украина", 400, "Бугалтер",
                "Бугалтерия"));

    }

    public void run() {

        System.out.println("Общий средний возраст");
        System.out.println(overallAverageAge() + " лет");
        System.out.println();
        System.out.println("Средний возраст до 18 лет");
        System.out.println(averageAgeUnder18() + " лет");
        System.out.println();
        System.out.println();

        java.lang.System.out.println("Люди у которых почта @gmail.com или @mail.ru");
        System.out.println();

        peopleWithMailGmailMail = email();
        showAll();

        System.out.println();
        System.out.println();

        System.out.println("Все почты, сотрудников, женщин до 30 лет");
        System.out.println();
        peopleWithMailGmailMail = mailEmployeesWomenUnder30();
        showAll();
    }

    //  вывод на экран   почту @gmail.com или @mail.ru
    public void showAll() {
        for (User user : peopleWithMailGmailMail) {
            System.out.println(user);
        }

    }

    //   общий средний возраст
    public int overallAverageAge() {
        int num = 0;

        for (int i = 0; i < usersAndEmployees.size(); i++) {
            num += usersAndEmployees.get(i).getAGE();
        }

        num /= usersAndEmployees.size();

        return num;
    }

    //   средний возраст среди не совершеннолетних
    public int averageAgeUnder18() {
        int val = 0;
        int count = 0;
        for (User ageUnder18 : usersAndEmployees) {
            if (ageUnder18.getAGE() < 18) {
                val += ageUnder18.getAGE();
                count++;
            }
        }

        return val / count;
    }

    //  почта @gmail.com или @mail.ru
    public ArrayList<User> email() {

        String[] mail;

        for (User people : usersAndEmployees) {
            mail = people.getMAIL().split("@");

            if (mail[1].equalsIgnoreCase("gmail.com") ||
                    mail[1].equalsIgnoreCase("mail.ru")) {

                peopleWithMailGmailMail.add(people);


            }
        }

        return peopleWithMailGmailMail;
    }

    // почта женщин сотрудников до 30 лет
    public ArrayList<User> mailEmployeesWomenUnder30() {

        for (User people : usersAndEmployees) {
            if (people instanceof Employee &&
                    people.getGENDER().equalsIgnoreCase("женщина")
                    && people.getAGE() < 30) {
                mailEmployeesWomen.add(people);
            }
        }
        return mailEmployeesWomen;
    }


}