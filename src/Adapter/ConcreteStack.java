package Adapter;

import java.util.ArrayList;

public class ConcreteStack implements Stack {

    private ArrayList<Integer> stack;

    public ConcreteStack(){
        stack = new ArrayList<Integer>();
    }

    @Override
    public void push(int value) {
        stack.add(value);
    }

    @Override
    public void pop() {
        stack.remove(stack.size() - 1);
    }
}
