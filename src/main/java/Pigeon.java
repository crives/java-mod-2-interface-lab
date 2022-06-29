public class Pigeon implements CanFly, Animal {
    public int fly() {
        System.out.println("I'm a pigeon and I can fly up to 90 miles an hour!");
        return 90;
    }

    public void takeBreath() {
        System.out.println("Pigeon has taken a breath");
    }

    public void makeSound() {
        System.out.println("Pigeon goes coo, coo");
    }
}