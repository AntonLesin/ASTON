import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        try {
            int sum = sumArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные в массиве: " + e.getMessage());
        }
    }

    public static int sumArray(int[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += array[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + ", " + j + "]");
                }
            }
        }

        return sum;
    }
}
