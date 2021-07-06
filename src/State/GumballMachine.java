package State;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    // Because the machine is empty, its current state is sold out
    private State currentState = soldOutState;

    // The machine is empty initially
    private int count = 0;

    public GumballMachine(int numberOfGumballs){
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        count = numberOfGumballs;

        // If the number of gumballs is larger than 0 we change state
        currentState = noQuarterState;
    }
    void insertQuarter(){
        currentState.insertQuarter();
    }
    void ejectQuarter(){
        currentState.ejectQuarter();
    }
    void turnCrank(){
        currentState.turnCrank();
    }
    void dispense(){
        currentState.dispense();
    }


    void setState(State newState){
        this.currentState = newState;
    }

    // Getters used inside each state class
    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public void releaseGumball(){
        if(count >= 0)
            count = count - 1;
    }
}
