import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] elements = {"f10", "a15", "f2", "f4", "f5", "b54", "a16"};
        Arrays.sort(elements);
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
