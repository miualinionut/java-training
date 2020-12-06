package code._4_student_effort.challenge_4_observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Teacher implements ObservedSubject {

    String topic;
    private final PropertyChangeSupport support;

    public Teacher(){
        topic = "";
        support = new PropertyChangeSupport(this);
    }

    @Override
    public void register(Observer obj) {
        support.addPropertyChangeListener((PropertyChangeListener) obj);
    }

    @Override
    public void unregister(Observer obj) {
        support.removePropertyChangeListener((PropertyChangeListener) obj);
    }

    @Override
    public void notifyObserver(String message) {
        support.firePropertyChange("JavaTopic", this.topic, message);
        this.topic = message;
    }

    void teach(String topic)
    {
        notifyObserver(topic);
    }
}
