public class FactorialCalculator {

    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
        }
        if (n == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        int number = 6;
        int result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + result);
    }
}