import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneNumbers = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneNumbers.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneNumbers.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneNumbers.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "8855544444");
        phoneBook.add("Петров", "8333222555");
        phoneBook.add("Иванов", "9995554445");

        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Петров"));
    }
}
