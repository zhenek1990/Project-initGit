package newHomeworkAssignment.people;

public class User {

    private final String FIRST_LAST_NAME;
    private final int AGE;
    private final String GENDER;
    private final String MAIL;
    private final String COUNTRY;

    public User(String firstLastName, int age, String gender, String email, String country) {
        this.FIRST_LAST_NAME = firstLastName;
        this.AGE = age;
        this.GENDER = gender;
        this.MAIL = email;
        this.COUNTRY = country;
    }

    public String getFIRST_LAST_NAME() {
        return FIRST_LAST_NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public String getGENDER() {
        return GENDER;
    }

    public String getMAIL() {
        return MAIL;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    @Override
    public String toString() {
        return "* Имя и Фамилия :" + FIRST_LAST_NAME + " * " +
                "* возраст :" + AGE + " * " +
                "* пол :" + GENDER + " * " +
                "* електроная почта :" + MAIL + " * " +
                "* страна :" + COUNTRY + " * ";
    }
}
