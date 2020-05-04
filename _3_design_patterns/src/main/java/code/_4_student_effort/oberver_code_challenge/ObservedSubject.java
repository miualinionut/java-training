package code._4_student_effort.oberver_code_challenge;

interface ObservedSubject {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers(String message);
}
