import java.util.Random;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100);
        }
        int evenCount = 0;
        for (int number : randomNumbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);
    }
}