//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Создать справочник сотрудников
 * Необходимо: Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEmploye("Ivan", 2256,1,20);
        phoneBook.addEmploye("Kolya", 2231,2,5);
        phoneBook.addEmploye("Kostya", 2456,5,1);
        phoneBook.addEmploye("Olga", 1234,6,22);

        phoneBook.printEmploye();
        System.out.println(phoneBook.searchById(5));
        System.out.println(phoneBook.searchByNumber("Ivan"));
        System.out.println(phoneBook.searchByWorkYear(22));

    }
}