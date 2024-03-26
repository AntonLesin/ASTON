import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "dog", "cat", "apple", "banana", "dog", "fish", "cat"};

        List<String> uniqueWords = Arrays.asList(words);
        uniqueWords = new ArrayList<>(new HashSet<>(uniqueWords));

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
