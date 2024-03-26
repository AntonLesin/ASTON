public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("Создано животных: " + Animal.animalCount);
        System.out.println("Создано котов: " + Cat.catCount);
        System.out.println("Создано собак: " + Dog.dogCount);

        animal1.run(150);
        cat1.run(150);
        dog1.run(300);

        animal1.swim(5);
        cat1.swim(5);
        dog1.swim(10);

        Bowl bowl = new Bowl(10);
        Cat[] cats = {new Cat(), new Cat(), new Cat()};

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println("Кот #" + cat.id + " сыт: " + cat.isHungry());
        }

        bowl.addFood(5);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        for (Cat cat : cats) {
            System.out.println("Кот #" + cat.id + " сыт: " + cat.isHungry());
        }

        Circle circle = new Circle(5, "blue", "black");
        System.out.println("Характеристики круга:");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(4, 7, "green", "brown");
        System.out.println("\nХарактеристики прямоугольника:");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(3, 4, 5, "yellow", "red");
        System.out.println("\nХарактеристики треугольника:");
        triangle.printCharacteristics();
    }
}