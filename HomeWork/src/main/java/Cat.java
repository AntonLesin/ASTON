public class Cat extends Animal {
    public static int catCount = 0;
    public boolean isHungry = true;
    public Cat() {
        super();
        catCount++;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println("Кот #" + id + " не может пробежать больше 200 м.");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Кот #" + id + " не умеет плавать.");
    }
    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() > 0) {
            bowl.setFoodAmount(bowl.getFoodAmount() - 1);
            isHungry = true;
        }
    }
    public boolean isHungry() {
        return isHungry;
    }
}