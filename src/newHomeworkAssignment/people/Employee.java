package newHomeworkAssignment.people;

public class Employee extends User {

    private final int SALARY;  // оклад
    private final String POSITION;  // должность
    private final String DEPARTMENT;  // отдел

    public Employee(String firstLastName, int age, String gender, String email,
                    String country, int salary, String position, String department) {
        super(firstLastName, age, gender, email, country);
        this.SALARY = salary;
        this.POSITION = position;
        this.DEPARTMENT = department;
    }

    public int getSALARY() {
        return SALARY;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +"\n"+
                "Сотрудники : \n" +
                "* оклад :" + SALARY +"$ * " +
                "* должность :" + POSITION + " * " +
                "* отдел :" + DEPARTMENT + " * ";
    }



}
