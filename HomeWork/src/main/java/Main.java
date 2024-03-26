public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSing() {
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 0;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value > 0 && value <=100) {
            System.out.println("Желтый");
        } else {System.out.println("Зеленый");}
    }
    public static void compareNumbers() {
        int a = 8;
        int b = 6;
        if (a >= b) {System.out.println("a >= b");
        } else {System.out.println("a < b");}
    }
}