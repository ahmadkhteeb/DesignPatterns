package Adapter;

import java.util.ArrayList;

public class ConcreteList implements List {

    private ArrayList<Integer> list;

    public ConcreteList(){
        list = new ArrayList<Integer>();
    }

    @Override
    public void append(int value) {
        list.add(value);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    public int getListSize(){
        return list.size();
    }

    public int getItem(int index){
        return list.get(index);
    }
}
