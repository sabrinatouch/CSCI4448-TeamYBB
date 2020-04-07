
public class EntryChange implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for ( Observer o : observers) {
            o.update(m);
        }
    }
}