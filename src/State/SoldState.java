package State;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Take the gumball before trying to buy another one");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn the crank twice!");

    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();

        if(gumballMachine.getCount() >= 0){
            System.out.println("Gumball taken");

            // If machine got out of balls we change state to sold out
            if(gumballMachine.getCount() == 0)
                gumballMachine.setState(gumballMachine.getSoldOutState());
            else
                gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Sorry, we are out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
