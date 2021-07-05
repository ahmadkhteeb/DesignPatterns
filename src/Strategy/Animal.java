package Strategy;

public class Animal {
    String name;
    FlyBehaviour flyBehaviour;
    Animal(String name, FlyBehaviour flyBehaviour){
        this.name = name;
        this.flyBehaviour = flyBehaviour;
    }

    void fly(){
        flyBehaviour.fly();
    }

}
