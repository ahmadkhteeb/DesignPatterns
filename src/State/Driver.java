package State;

public class Driver {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

        // Try moving to non-valid state to test the implementation
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.dispense();
        gumballMachine.ejectQuarter();

        System.out.println("--------------------------------------------------------------");

        // Testing the implementation on a valid sequence
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();


    }
}
