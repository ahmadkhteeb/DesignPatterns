package Observer;

import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observersList;

    Subject(){
        observersList = new ArrayList<Observer>();
    }


    void addObserver(Observer observer){
        observersList.add(observer);
    }

    void removeObserver(Observer observer){
        int position = observersList.indexOf(observer);
        if(position >= 0)
            observersList.remove(position);
    }

    abstract void notifyObservers();

}
