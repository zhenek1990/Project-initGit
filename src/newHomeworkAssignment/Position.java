package newHomeworkAssignment;

public enum Position {

    ACCOUNTANT("Бухгалтер"), ANDROID_DEV("Android-Developer"),
    MANAGER("менеджер"), TESTER("Тестировщик"), DESIGNER("Дизайнер");
    public String val;
    Position(String val) {
        this.val = val;
    }
}
