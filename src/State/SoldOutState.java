package State;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, we are out of gumballs");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, we are out of gumballs. you can get your quarter ejected");
    }

    @Override
    public void dispense() {
        System.out.println("You can't dispense while the machine is empty");
    }
}
