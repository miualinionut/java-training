package code._2_challenge._4_observer;

public interface ObservedSubject {

  void register(Observer obj);

  void unregister(Observer obj);

  void notifyObservers(String message);

}