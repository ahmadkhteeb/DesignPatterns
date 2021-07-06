package Adapter;

// Used to adapt a list as stack
public class ListAdapter implements Stack {

    private List list;

    public ListAdapter(List list){
        this.list = list;
    }

    @Override
    public void push(int value) {
        list.append(value);
        System.out.println(value + " Pushed to stack");
    }

    @Override
    public void pop() {
        System.out.println(list.getItem(list.getListSize() - 1) + " Popped");
        list.remove(list.getListSize() - 1);
    }
}
