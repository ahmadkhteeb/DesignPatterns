package Adapter;

public class Driver {
    public static void main(String[] args) {

        // Instantiating a list to adapt it as stack
        List list = new ConcreteList();
        Stack stack = new ListAdapter(list);

        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.pop();

    }
}
