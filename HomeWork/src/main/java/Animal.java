public class Animal {
    public static int animalCount = 0;
    public int id;
    public Animal() {
        animalCount++;
        id = animalCount;
    }
    public void run(int distance) {
        System.out.println("Животное #" + id + " пробежало " + distance + " м.");
    }
    public void swim(int distance) {
        System.out.println("Животное #" + id + " проплыло " + distance + " м.");
    }
}
