public class Main {
    public static void main(String[] args) {
        // Создаем коробки для яблок
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        // Выводим вес коробок с яблоками
        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        System.out.println("Сравнение веса коробок с яблоками: " + appleBox1.compare(appleBox2));

        // Создаем коробку для апельсинов
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        // Выводим вес коробки с апельсинами
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        // Пересыпаем фрукты из одной коробки с яблоками в другую
        appleBox1.transferFruitsToAnotherBox(appleBox2);

        // Выводим вес коробок после пересыпания
        System.out.println("Вес коробки с яблоками 1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2 после пересыпания: " + appleBox2.getWeight());
    }
}
