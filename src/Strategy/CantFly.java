package Strategy;

public class CantFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly...");
    }
}
