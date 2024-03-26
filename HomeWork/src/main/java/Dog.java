public class Dog extends Animal {
    public static int dogCount = 0;
    public Dog() {
        super();
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println("Собака #" + id + " не может пробежать больше 500 м.");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println("Собака #" + id + " не может проплыть больше 10 м.");
        }
    }
}
