import java.util.ArrayList;
import java.util.List;

public class СollectionString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Highload");
        strings.add("High");
        strings.add("Load");
        strings.add("Highload");

        // 2.1
        long countHigh = strings.stream().filter(s -> s.equals("High")).count();
        System.out.println("Количество 'High': " + countHigh);

        // 2.2
        String firstElement = strings.isEmpty() ? "0" : strings.get(0);
        System.out.println("Первый элемент: " + firstElement);

        // 2.3
        String lastElement = strings.isEmpty() ? "0" : strings.get(strings.size() - 1);
        System.out.println("Последний элемент: " + lastElement);
    }
}