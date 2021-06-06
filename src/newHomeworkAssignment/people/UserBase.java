package newHomeworkAssignment.people;


import newHomeworkAssignment.Mail;
import newHomeworkAssignment.Position;

import java.util.ArrayList;
import java.util.List;

public class UserBase {

    public List<User> allUser() {

        List<User> human = new ArrayList<>();

        human.add(new User("Иван Иванов", 30, Gender.MAN.val,
                "ivan2021" + Mail.GMAIL.val, Country.UKRAINE.val));
        human.add(new User("Марта Мартынова", 28, Gender.WOMAN.val,
                "marta" + Mail.GMAIL.val, Country.UKRAINE.val));
        human.add(new User("Петя Петеньков", 17, Gender.MAN.val,
                "petya777" + Mail.YANDEX.val, Country.RUSSIA.val));
        human.add(new User("Васелиса Петенькова", 14, Gender.WOMAN.val,
                "vaselisa.the.best" + Mail.MAIL, Country.RUSSIA.val));
        human.add(new User("Фёдор Федорчиков", 42, Gender.MAN.val,
                "fedor.fedorchikov" + Mail.RAMBLER.val, Country.UKRAINE.val));

        human.add(new Employee("Лариса Ларькина", 26, Gender.WOMAN.val,
                "larkina_lara" + Mail.MAIL.val, Country.RUSSIA.val,
                1000, Position.MANAGER.val, "отдел продаж"));
        human.add(new Employee("Максим Максимов", 23, Gender.MAN.val,
                "maksimka111" + Mail.YANDEX.val, Country.UKRAINE.val,
                800, Position.TESTER.val, "Отдел разработки ПО"));
        human.add(new Employee("Карина Каривчановна", 22, Gender.WOMAN.val,
                "Karinka787" + Mail.RAMBLER.val, Country.UKRAINE.val,
                900, Position.DESIGNER.val, "3D-дизайнер"));
        human.add(new Employee("Светлана Светланько", 31, Gender.WOMAN.val,
                "Svetik228" + Mail.YANDEX.val, Country.UKRAINE.val,
                600, Position.ACCOUNTANT.val, "Бугалтерия"));
        human.add(new Employee("Виталий Переданков", 32, Gender.MAN.val,
                "Zhenek228" + Mail.GMAIL.val, Country.RUSSIA.val,
                1500, Position.ANDROID_DEV.val, "Отдел разработки ПО"));
        human.add(new Employee("Ольга Олефандровна ", 28, Gender.WOMAN.val,
                "olechka.ol" + Mail.GMAIL.val, Country.UKRAINE.val,
                400, Position.ACCOUNTANT.val, "Бугалтерия"));

        return human;
    }

    public enum Country {
        UKRAINE("Украина"), RUSSIA("Россия");
        String val;

        Country(String val) {
            this.val = val;
        }
    }

    public enum Gender {
        MAN("мужчина"), WOMAN("женщина");

        String val;

        Gender(String val) {
            this.val = val;
        }
    }

}
