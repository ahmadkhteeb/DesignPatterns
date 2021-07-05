package Strategy;

public class CanFly implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
