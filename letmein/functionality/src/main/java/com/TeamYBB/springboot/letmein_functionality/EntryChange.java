import java.util.ArrayList;

public class EntryChange implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Message m) {
        for ( Observer o : observers) {
            o.update(m);
        }
    }
}