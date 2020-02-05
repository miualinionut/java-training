import java.util.ArrayList;

public class Produs implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    private String numeProdus;
    private String tipProdus;
    String valabilitate;

    public Produs(String numeProdus, String tipProdus, String valabilitate) {
        this.numeProdus = numeProdus;
        this.tipProdus = tipProdus;
        this.valabilitate = valabilitate;
    }

    public void setValabilitate(String valabilitate) {
        this.valabilitate = valabilitate;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notificam observerii ca produsul este in stock");
        for (Observer o : observers){
            o.update(this.valabilitate);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }
}
