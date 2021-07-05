package Strategy;

public class Driver {
    public static void main(String[] args) {
        FlyBehaviour canFly = new CanFly();
        FlyBehaviour cantFly = new CantFly();
        Animal dog = new Dog("Spike", cantFly);
        Animal bird = new Bird("Tom", canFly);
        dog.fly();
        bird.fly();
    }
}
