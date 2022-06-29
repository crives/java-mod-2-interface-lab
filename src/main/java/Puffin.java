public class Puffin implements Animal, CanSwim, CanFly {
    public int fly() {
        System.out.println("I'm puffin and I can fly up to 55 miles an hour!");
        return 55;
    }

    public void swim() {
        System.out.println("I'm a puffin and I can swim down to 200 feet deep");
    }

    public void takeBreath() {
        System.out.println("Puffin took a breath");
    }

    public void makeSound() {
        System.out.println("Puffin goes brau, brau");
    }
}