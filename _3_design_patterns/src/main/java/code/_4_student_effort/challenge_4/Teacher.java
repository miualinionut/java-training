package code._4_student_effort.challenge_4;

import java.util.Arrays;

public class Teacher implements ObservedSubject{

    private Observer[] obs = new Observer[0];

    @Override
    public void register(Observer obj) {
        this.obs = Arrays.copyOf(this.obs, this.obs.length + 1);
        this.obs[this.obs.length - 1] = obj;

    }

    public void unregister(Observer obj) {
        int removedIndex = -1;
        for (int i = 0; i < this.obs.length; i++) {
            if (this.obs[i].equals(obj)) {
                removedIndex = i;
                break;
            }
        }
        System.arraycopy(this.obs, removedIndex + 1, this.obs, removedIndex, this.obs.length - 1 - removedIndex);

    }


    @Override
    public void notifyObservers(String message) {
        for (int i = 0; i < this.obs.length; i++) {
            this.obs[i].update(message);
        }
    }

    public void teach(String topic) {
        for (int j = 0; j < this.obs.length; j++) {
            this.obs[j].update(topic);
        }
    }
}


