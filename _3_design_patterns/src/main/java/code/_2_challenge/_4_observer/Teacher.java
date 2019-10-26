package code._2_challenge._4_observer;

import java.util.Arrays;

public class Teacher implements ObservedSubject {
  private Observer[] observers = new Observer[0];

  @Override
  public void register(Observer obj) {
    this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
    this.observers[this.observers.length - 1] = obj;
  }

  @Override
  public void unregister(Observer obj) {
    int removedIndex = -1;
    for (int i = 0; i < this.observers.length; i++) {
      if (this.observers[i].equals(obj)) {
        removedIndex = i;
        break;
      }
    }
    System.arraycopy(this.observers, removedIndex + 1, this.observers, removedIndex, this.observers.length - 1 - removedIndex);

  }

  @Override
  public void notifyObservers(String message) {
    for (int i = 0; i < this.observers.length; i++) {
      this.observers[i].update(message);
    }
  }

  public void teach(String topic) {
    for (int j = 0; j < this.observers.length; j++) {
      this.observers[j].update(topic);
    }
  }
}
