/* Переписать последнюю классную работу императивным подходом(циклами)
        1. Создать класс User, который должен хранить следующую инф. о пользователе: полное имя, возраст,
        пол, электронную почту, страну проживания;
        2. Создать класс Employee, который должен хранить следующую информацию: вся инф. о пользователе,
         оклад, должность, отдел;
        3. Создать массив(arraylist), который хранит как экземпляры класса User, так и экземпляры класса Employee;
        4. Работа с массивом(arraylist):
        - Получить массив(arraylist) только с пользователями (экземпляры класса User, не Employee);
        - Получить средний возраст;
        - Получить средний возраст среди несовершеннолетних;
        - Получить средний оклад на отдел;
        - Получить пользователей у которых почта "gmail.com". +: test@gmail.com, -: test@example.com;
        - Получить электронные почты все совершеннолетних женщин, не старше 30 лет, проживающих в Украине,
 которые являются сотрудниками.
*/
        package newHomeworkAssignment;

public class Main {
    public static void main(String[] args) {

        Prog prog = new Prog();
        prog.go();


    }
}