import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        //проверка вывода задание №1
        System.out.println(between10and20(8, 5));
        System.out.println(between10and20(11, 10));
        //проверка вывода задание №2
        printNumberSign(5);
        printNumberSign(0);
        printNumberSign(-5);
        //проверка вывода задание №3
        System.out.println(negativeNumber(-10));
        System.out.println(negativeNumber(10));
        //проверка вывода задание №4
        printRepeatedly("Всё получится!", 2);
        //проверка вывода задание №5
        System.out.println(leapYear(2000));
        System.out.println(leapYear(2023));
        //проверка вывода задание №6
        int[] array = {1, 1, 1, 0, 0, 0};
        flipArray(array);
        System.out.println(Arrays.toString(array));
        //проверка вывода задание №7
        int[] filledArray = new int[100];
        fillArray(filledArray);
        System.out.println(Arrays.toString(filledArray));
        //проверка вывода задание №8
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(numbers);
        System.out.println(Arrays.toString(numbers));
        //проверка вывода задание №9
        int[][] matrix = new int[5][5];
        fillDiagonalWithOnes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        //проверка вывода задание №10
        int[] newArray = createArray(5, 10);
        System.out.println(Arrays.toString(newArray));
    }
    //задание №1
    public static boolean between10and20(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <=20;
    }
    //задание №2
    public static void printNumberSign(int num) {
        if (num >=0) {
            System.out.println("Положительное число");
        } else {System.out.println("Отрицательное число");}
    }
    //задание №3
    public static boolean negativeNumber(int numb){
        return numb < 0;
    }
    //задание №4
    public static  void printRepeatedly(String str, int count){
        for (int i = 0; i < count; i++){
            System.out.println(str);
        }
    }
    //задание №5
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    //задание №6
    public static void flipArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }
    //задание №7
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    //задание №8
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
    //задание №9
    public static void fillDiagonalWithOnes(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }
    //задание №10
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
