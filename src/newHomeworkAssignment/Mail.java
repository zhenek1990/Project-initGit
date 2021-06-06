package newHomeworkAssignment;

public enum Mail {
    GMAIL("@gmail.com"), MAIL("@mail.ru"), YANDEX("@ya.ru"), RAMBLER("@rambler.ru");

    public String val;

    Mail(String val) {
        this.val = val;
    }
}
