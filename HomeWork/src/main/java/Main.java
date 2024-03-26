public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Лесин Антон Сергеевич", "QA A", "anton_lesin@mail.ru", "811111", 30000, 32);
        employees[1] = new Employee("Пупкин Иван Васильевич", "Engineer", "pupkin_ivan@mail.ru", "822222", 15000, 20);
        employees[2] = new Employee("Умелов Андрей Геннадьевич", "Developer", "umelon_andrei@mail.ru", "833333", 50000, 28);
        employees[3] = new Employee("Крутой Сергей Павлович", "Team lead", "super_puper@mail.ru", "844444", 150000, 40);
        employees[4] = new Employee("Мускул Пётр Владимирович", "Security", "pyku_bazyku@mail.ru", "855555", 60000, 50);
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println();
        }
        Park park = new Park();
        Park.Attraction[] attractions = new Park.Attraction[2];
        attractions[0] = park.new Attraction("Колесо обозрения", "10:00 - 12:00", 215.5);
        attractions[1] = park.new Attraction("Карусель", "09:00 - 10:00", 155.5);
        for (Park.Attraction attraction : attractions) {
            System.out.println(attraction);
            System.out.println();
        }
    }
}
